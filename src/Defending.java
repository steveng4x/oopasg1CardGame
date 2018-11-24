
public class Defending extends Pokemon{
	
	private int resistancePoints;

	//Constructor
	public Defending(String name, int hp, int stage, int energy,
			int exp, String element, String type, String moves,
			String status, int resistancePoints) {
		setName(name);
		setHp(hp);
		setStage(stage);
		setStage(energy);
		setExp(exp);
		setElement(element);
		setType(type);
		setMoves(moves);
		setStatus(status);
		setResistancePoints(resistancePoints);
	}

	//toString
	@Override
	public String toString() {
		return "Defending [resistancePoints=" + resistancePoints + "]";
	}

	//Setters//Getters
	/**
	 * @return
	 */
	public int getResistancePoints() {
		return resistancePoints;
	}

	public void setResistancePoints(int resistancePoints) {
		this.resistancePoints = resistancePoints;
	}
}
