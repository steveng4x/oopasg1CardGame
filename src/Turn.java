import java.util.Scanner;
import java.util.Random;
import java.util.List;
import java.util.Arrays;
public class Turn extends Board{
	Scanner keyboard = new Scanner(System.in);
	
	private int option;
	private enum Coin{Heads, Tails};
	
	Random randomNum = new Random();
	private int result = randomNum.nextInt(2);
	private int heads = 0;
	private int tails = 1;
	Coin coinFlip;

	
	

	public void flip(){
	    if(result == 0){
	        coinFlip = Coin.Heads;
	        System.out.println("You flipped Heads!");
	        
	    }
	    else{
	        coinFlip = Coin.Tails;
	        System.out.println("You flipped Tails!");
	    }
	}
	
	public int getOption() {
		return option;
	}

	public void setOption(int option) {
		this.option = option;
	}
	
	public void attack() {
		if (option==1){
		System.out.println("Choose Pokemon: ");
		int choose1 = keyboard.nextInt();
		if (choose1>=1 && choose1<=6) {
		System.out.println("Attack Pokemon: ");
		int chooseatk = keyboard.nextInt();
		weaknessCheck();
		flip();
		
		}
		else {
			System.out.println("Error");
		}
		}
	}
	
	public void weaknessCheck() {
		




	}
	
	public void recharge() {
		if (option==2) {
			System.out.println("Choose Pokemon: ");
			int choose2 = keyboard.nextInt();
			if (choose2 >=1 && choose2 <= 6) {
				System.out.println("Draw card..." );
				energydrawCheck();
			}
			else {
				System.out.println("Error");
			}
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
	
	public void train() {
		if (option==3){
			System.out.println("Choose Pokemon: ");
			int choose3 = keyboard.nextInt();
			if (choose3>=1 && choose3<=6) {
				
			}
			else {
				System.out.println("Error");
			}
			}
	}
	
	public void expCheck() {
		
	}
	
	public void evolve() {
		if (option==4) {
			
		}
	}
	
	public void changeCard() {
		
	}
	
}
