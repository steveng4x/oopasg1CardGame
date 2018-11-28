import java.util.ArrayList;
import java.util.Scanner;

public class testGame {
	public static void main(String[] args) {
		
		//Variables
		Scanner keyboard = new Scanner(System.in);
		ArrayList<ArrayList<Pokemon>>tempPokelist = new ArrayList<ArrayList<Pokemon>>();
		ArrayList<Pokemon>p1Poke = new ArrayList<Pokemon>();
		ArrayList<Pokemon>p2Poke = new ArrayList<Pokemon>();
		ArrayList<Board>player = new ArrayList<Board>();
		
		//Identity
		System.out.println("Player 1 Name: ");
		String player1name = keyboard.nextLine();
		Board player1 = new Board(player1name);
		System.out.println("Player 2 Name: ");
		String player2name = keyboard.nextLine();
		Board player2 = new Board(player2name);
		player.add(player1);
		player.add(player2);
		
		//Start
		System.out.println("Choose option:\n\t1. Start game\n\t2. Display top 10 scores");
		int hoptions = keyboard.nextInt();
		System.out.println("Option: " + hoptions);
		
		switch(hoptions){
		case 1://GameOption
			Board.startGame(player1name, player2name, p1Poke, p2Poke);
			Player p1 = new Player(player1, p1Poke);
			Player p2 = new Player(player2, p2Poke);
			
			
			while(Board.getWin() == false) {
				tempPokelist = Turn.selectionOption(player1name, p1Poke, p2Poke);
				p1Poke = tempPokelist.get(0);
				p2Poke = tempPokelist.get(1);
				p1.setPokeList(p1Poke);
				p2.setPokeList(p2Poke);
				
				player1.increaseTurn();
				if (p2Poke.size() <= 3) {
					Board.setWin(true);
					System.out.print(player1name + " Win!!!");
					break;
				}
				tempPokelist = Turn.selectionOption(player2name, p2Poke, p1Poke);
				p2Poke = tempPokelist.get(0);
				p1Poke = tempPokelist.get(1);
				p1.setPokeList(p1Poke);
				p2.setPokeList(p2Poke);
				player2.increaseTurn();
				if (p1Poke.size() <= 3) {
					Board.setWin(true);
					System.out.print(player2name + " Win!!!");
					break;
				}
			}
			break;
		case 2://ScoreBoard
			break;
		}
		keyboard.close();
	}
}
