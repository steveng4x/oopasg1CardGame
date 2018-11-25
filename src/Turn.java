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
	public void optionSelection(String player) {
		System.out.println("Player1:\n"
			+"Option 1: Attack\n"
			+"Option 2: Recharge\n"
			+"Option 3: Train\n"
			+"Choose the option: ");
		int tempSelect = keyboard.nextInt();
		System.out.print("\nChoose Pokemon: ");
		int tempPoke = keyboard.nextInt();
		if (tempPoke >= 1 && tempPoke <= 6) {
			if (tempSelect >= 1 && tempSelect <= 3) {
				switch(tempSelect) {
				case 1:
					System.out.print("Attack Pokemon: ");
					int targetPoke = keyboard.nextInt(); 
					optionAttack(tempPoke ,targetPoke);
					
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
	
	public void optionAttack(int atkPoke, int targetPoke) {
		
	}
	
	public void optionRecharge() {
		
	}
	
	public void optionTrain() {
		
	}
	
	public void weaknessCheck() {
		




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
