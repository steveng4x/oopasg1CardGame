
public class Board {
	
	private int turn;
	private String playername;
	
	
	//Constructor
	
	
	//Setter//Getter
	/**
	 * 
	 * @return
	 */
	public String getPlayername() {
		return playername;
	}
	
	public void setPlayername(String playername) {
		this.playername = playername;
	}

	//toString
	@Override
	public String toString() {
		return "Board [turn=" + turn + ", playername=" + playername + "]";
	}
	
	//otherMethod
	public void startDraw() {
		
	}
	
	public void pokeList() {
		
	}
	
	public void flipCoin() {
		
	}
	
}
