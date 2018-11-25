import java.util.Scanner;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
public class Turn {
	
	
	Scanner keyboard = new Scanner(System.in);
	
	private int option;
	private enum Coin{Heads, Tails};
	
	Random randomNum = new Random();
	private int result = randomNum.nextInt(2);
	private int heads = 0;
	private int tails = 1;
	Coin coinFlip;
	
	//Setters//Getters
	/**
	 * @return
	 */
	public int getOption() {
		return option;
	}

	public void setOption(int option) {
		this.option = option;
	}
	
	//otherMethod
	public void optionSelection(String player, ArrayList<Pokemon> inPlayer, ArrayList<Pokemon> outPlayer) {
		System.out.println("Player1:\n"
			+"Option 1: Attack\n"
			+"Option 2: Recharge\n"
			+"Option 3: Train\n"
			+"Choose the option: ");
		int tempSelect = keyboard.nextInt();
		System.out.print("\nChoose Pokemon: ");
		int movPoke = keyboard.nextInt();
		if (movPoke >= 1 && movPoke <= 6) {
			if (tempSelect >= 1 && tempSelect <= 3) {
				switch(tempSelect) {
				case 1:
					System.out.print("Attack Pokemon: ");
					int targetPoke = keyboard.nextInt();
					Pokemon x = inPlayer.get(movPoke);
					Pokemon y = outPlayer.get(targetPoke);
					optionAttack(x, y);

				case 2:
					optionRecharge();
					
				case 3:
					optionTrain();
					
				}
			}else {
				throw new ArithmeticException("Out of Option Range.");
			}
		}else {
			throw new ArithmeticException("Out of Option Range.");
		}
	}
	
	public void optionAttack(Pokemon atkPoke, Pokemon targetPoke) {
		int energyReduction;
		int atk = atkPower(atkPoke);
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
			if (flip()) {
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
		expCheck(atkPoke);
	}
	
	public void optionRecharge() {
		
	}
	
	public void optionTrain() {
		
	}
	
	public boolean weaknessCheck(Pokemon poke1, Pokemon poke2) {
		if (poke1.getType() == poke2.getType()) {
			return true;
		}else {
			return false;
		}
	}
	
	private int defPower(Pokemon poke) {
		int def = 0;
		if (poke.getType().equals("Defending")) {
			if (flip()) {
				System.out.print("[Flip a Coin: Head( Defend Success!!! )] ");
				def = poke.getResistancePoints();
			} else {
				System.out.print("[Flip a Coin: Tail( Defend Fail... )] ");
			}
		}
		System.out.println("ResistPoint = " + def);
		return def;
	}
	
	private int atkPower(Pokemon poke) {
		int atk = 2;
		if (poke.getType().equals("Attack")) {
			if (flip()) {
				System.out.print("[Flip a Coin: Head( Attack Success!!! )] ");
				atk = poke.getAttackingPoints();
			} else {
				System.out.print("[Flip a Coin: Tail( Attack Fail... )]");
				atk = atk ^ (poke.getStage() - 1);
			}
		} else {
			atk = atk ^ (poke.getStage() - 1);
		}
		System.out.println("AttackPower = " + atk);
		return atk;
	}
	
	private void paralyze(Pokemon poke) {
		
	}
	
	private void poison(Pokemon poke) {
		
	}
	
	public boolean flip(){
	    if(result == 0){
	        coinFlip = Coin.Heads;
	        return true;
	    }
	    else{
	        coinFlip = Coin.Tails;
	        return false;
	    }
	}
	
	public void energydrawCheck() {
		List<String> givenList = Arrays.asList("red","blue","yellow","colourless");
		 Random rand = new Random();
		    String randomElement = givenList.get(rand.nextInt(givenList.size()));
		/**if (randomElement==element) {
			System.out.println(randomElement + "" + "Colour Matched");
	
		}**/
		
	}
	
	public void expCheck(Pokemon poke) {
		if (poke.getExp() >= 20) {
			poke.resetExp();
			poke.evolve();
		}
	}
	
	public void changeCard() {
		
	}
	
	public void statusCheck() {
		
	}
	
	
}
