import java.util.ArrayList;
import java.util.List;

public class Board extends Turn{
	private int turn;
	private String player1name;
	private String player2name;
	public void startDraw() {
		System.out.println("Each player draw 6 card");
	}

	
	public void pokeList() {
		List<Integer>Number = new ArrayList<>();
		List<String>Type = new ArrayList<>();
		List<Integer>Stage = new ArrayList<>();
		List<Integer>Experience = new ArrayList<>();
		List<Integer>HitPoint = new ArrayList<>();
		List<Integer>Energy = new ArrayList<>();
		List<String>EnergyColour = new ArrayList<>();
		List<Integer>AttackPoint = new ArrayList<>();
		List<Integer>ResistancePoint = new ArrayList<>();
		List<String>Status = new ArrayList<>();
	}
	
	public int getTurn() {
		return turn;
	}

	public void setTurn(int turn) {
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
		
	}
	
	
	

