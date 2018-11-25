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
		int atk = atkPower(atkPoke);
		if (weaknessCheck(atkPoke, targetPoke)) {
			
		}else {
			
		}
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
	
	private int atkPower(Pokemon poke) {
		int atk;
		if (poke.getType().equals("Attack")) {
			atk = poke.getAttackingPoints();
		}else {
			
		}
	}
	
	public int flip(){
	    if(result == 0){
	        coinFlip = Coin.Heads;
	        System.out.println("You flipped Heads!");
	        return result;
	    }
	    else{
	        coinFlip = Coin.Tails;
	        System.out.println("You flipped Tails!");
	        return result;
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
	
	public void expCheck() {
		
	}
	
	public void changeCard() {
		
	}
	
}
