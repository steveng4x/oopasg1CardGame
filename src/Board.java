import java.util.ArrayList;
import java.util.List;

public class Board extends Turn{
	private long turn;
	private String player1name;
	private String player2name;
	public void startDraw() {
		System.out.println("Each player draw 6 card");
		ArrayList<Pokemon>random = new ArrayList<Pokemon>();
		ArrayList<player1>playerone = new ArrayList<player1>();
		ArrayList<player2>playertwo = new ArrayList<player2>();
		
	}

	
	public void pokeList() {

	}
	
	public long getTurn() {
		return turn;
	}

	public void setTurn(long turn) {
		this.turn = turn;
	}

	public String getPlayer1name() {
		return player1name;
	}

	public void setPlayer1name(String player1name) {
		this.player1name = player1name;
	}

	public String getPlayer2name() {
		return player2name;
	}

	public void setPlayer2name(String player2name) {
		this.player2name = player2name;
	}
		
	public long countTurn(long  t) {
		turn = turn + t;
		return turn;
	}
	}
	

	

