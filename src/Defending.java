
public class Defending {
	private int resistancePoints;

	public Defending(int resistancePoints) {
		super();
		this.resistancePoints = resistancePoints;
	}

	@Override
	public String toString() {
		return "Defending [resistancePoints=" + resistancePoints + "]";
	}

	public int getResistancePoints() {
		return resistancePoints;
	}

	public void setResistancePoints(int resistancePoints) {
		this.resistancePoints = resistancePoints;
	}
}
