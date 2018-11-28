import java.util.Scanner;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.lang.Math;
public class Turn {
		
	private int option;
	private enum Coin{Heads, Tails};
	
	static Random randomNum = new Random();
	Coin coinFlip;
	
	//Setters//Getters
	public int getOption() {
		return option;
	}

	public void setOption(int option) {
		this.option = option;
	}
	
	//Constructors
	public Turn() {
		
	}
	
	//mainMethod
	public static ArrayList<ArrayList<Pokemon>> selectionOption(
			String player, ArrayList<Pokemon> inPlayer,ArrayList<Pokemon> outPlayer) {
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println(player + " Turn:\n"
			+"Option 1: Attack\n"
			+"Option 2: Recharge\n"
			+"Option 3: Train\n"
			+"Choose the option: ");
		int tempSelect = keyboard.nextInt();
		System.out.print("\nChoose Pokemon: ");
		int movPoke = keyboard.nextInt();
		if (movPoke >= 1 && movPoke <= inPlayer.size() && inPlayer.get(movPoke - 1).getStatus().equals("Active")) {
			if (tempSelect >= 1 && tempSelect <= 3) {
				Pokemon x = inPlayer.get(movPoke - 1);
				if (x.getEnergy() <= 0) {
					tempSelect = 2;
				}
				switch(tempSelect) {
				case 1:
					System.out.print("Attack Pokemon: ");
					int targetPoke = keyboard.nextInt();
					if (targetPoke >= 1 && targetPoke <= outPlayer.size()) {
						Pokemon y = outPlayer.get(targetPoke - 1);
						optionAttack(x, y);
					}else {
						throw new ArithmeticException("Out of Option Range.");
					}
					break;
				case 2:
					optionRecharge(x);
					break;
				case 3:
					optionTrain(x);
					break;
				}
				expCheck(x);
			}else {
				throw new ArithmeticException("Out of Option Range.");	
			}
		}else {
			throw new ArithmeticException("Out of Option Range.");
		}
		deadPokeCheck(outPlayer);
		checkState(inPlayer);
		ArrayList<ArrayList<Pokemon>> battleResult = new ArrayList<ArrayList<Pokemon>>();
		battleResult.add(inPlayer);
		battleResult.add(outPlayer);
		return battleResult;
	}
	
	//otherMethod
	private static void optionAttack(Pokemon atkPoke, Pokemon targetPoke) {
		int energyReduction;
		int atk = atkPower(atkPoke);
		System.out.println(atkPoke.getName() + " use " + atkPoke.getMoves() + ".");
		if (weaknessCheck(atkPoke, targetPoke)) {
			System.out.println("[Weakness: On, Double AttackPower]");
			atk = atk * 2;
			energyReduction = 2;
		} else {
			energyReduction = 1;
		}atkPoke.increaseExp(1);
		int def = defPower(targetPoke);
		if (atkPoke.getType().equals("Fairy")) {
			System.out.println("[Unique Skill Triggered]");
			if (flip() == true) {
				System.out.println("[Flip a Coin: Head( *Paralyze* )]");
				paralyze(targetPoke);
			}else {
				System.out.println("[Flip a Coin: Tail( *Poison* )]");
				poison(targetPoke);
			}
		}
		atkPoke.decreaseEnergy(energyReduction);
		int dmgTaken = atk - def;
		targetPoke.decreaseHp(dmgTaken);
		System.out.println("HitPoint for " + targetPoke.getName() + " is Damaged by " + dmgTaken);
		System.out.println("Energy for " + atkPoke.getName() + " is Reduced by " + energyReduction);
	}
	
	private static void optionRecharge(Pokemon Poke) {
		List<String> givenList = Arrays.asList("red","blue","yellow","colourless");
		Random rand = new Random();
	    String randomElement = givenList.get(rand.nextInt(givenList.size()));
	    System.out.println("EnergyElement Drawn: " + randomElement);;
	    if (randomElement == Poke.getElement()) {
	    	System.out.println("Color Matched!!!!");
	    	System.out.println("Energy for " + Poke.getName() + " is increase by 5.");
	    	Poke.increaseEnergy(5);
	    }else {
	    	System.out.println("Color not Matched....");
	    }
	}
	
	private static void optionTrain(Pokemon Poke) {
		System.out.println(Poke.getName() + " is being Trained.....");
		Poke.increaseExp(5);
		Poke.decreaseEnergy(5);
		System.out.println("Energy for " + Poke.getName() + " is decrease by 5,\n"
				+ "Experience is increase by 5.");
	}
	
	private static boolean weaknessCheck(Pokemon poke1, Pokemon poke2) {
		if (poke1.getType() == poke2.getType()) {
			return true;
		}else {
			return false;
		}
	}
	
	private static int defPower(Pokemon poke) {
		int def = 0;
		if (poke.getType().equals("Defending")) {
			if (flip() == true) {
				System.out.print("[Flip a Coin: Head( Defend Success!!! )]\n");
				def = poke.getResistancePoints();
			} else {
				System.out.print("[Flip a Coin: Tail( Defend Fail... )]\n");
			}
		}
		System.out.println("ResistPoint = " + def);
		return def;
	}
	
	private static int atkPower(Pokemon poke) {
		int atk;
		if (poke.getType().equals("Attacking")) {
			if (flip() == true) {
				System.out.print("[Flip a Coin: Head( Attack Success!!! )]\n");
				atk = poke.getAttackingPoints();
				System.out.println("AttackPower = " + atk);
				return atk;
			} else {
				System.out.print("[Flip a Coin: Tail( Attack Fail... )]\n");
				atk = (int)Math.pow(2, poke.getStage()-1);
				System.out.println("AttackPower = " + atk);
				return atk;
			}
		}else {
			atk = (int)Math.pow(2, poke.getStage()-1);
			System.out.println("AttackPower = " + atk);
			return atk;
		}
	}
	
	private static void paralyze(Pokemon poke) {
		poke.setStatus("Paralyze");
		poke.setStaticTimer(poke.getStaticTimer() + 2);
	}
	
	private static void poison(Pokemon poke) {
		poke.setStatus("Poison");
		poke.setStaticTimer(poke.getStaticTimer() + 1);
	}
	
	public static void checkState(ArrayList<Pokemon> poke) {
		for (Pokemon a: poke) {
			if (a.getStaticTimer() > 0) {
				a.decreaseStaticTimer();
				if (a.getStaticTimer() == 0) {
					naturalize(a);
				}
			}
		}
	}
	
	private static void naturalize(Pokemon poke) {
		if (!poke.getStatus().equals("Active")) {
			poke.setStatus("Active");
			System.out.println(poke.getName() + " has relived from StaticState.");
		}
	}
	
	private static boolean flip(){
		int result = randomNum.nextInt(2);
	    if(result == 0){
	        return true;
	    }
	    else{
	        return false;
	    }
	}
	
	private static void expCheck(Pokemon poke) {
		if (poke.getExp() >= 20 && poke.getStage() < 3) {
			poke.resetExp();
			poke.evolve();
		}
	}
	
	public static void deadPokeCheck(ArrayList<Pokemon> poke) {
		for (Pokemon a : poke) {
			if (a.getHp() <= 0) {
				poke.remove(a);
			}
		}
	}
}
