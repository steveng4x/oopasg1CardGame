import java.util.ArrayList;
import java.util.List;

public class Board extends Turn{
	private int turn;
	private String playername;
	
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

	public String getPlayername() {
		return playername;
	}

	public void setPlayername(String playername) {
		this.playername = playername;
	}

	
	
}
