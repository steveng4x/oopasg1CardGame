
public class Defending extends Pokemon{
	private int resistancePoints;

	public Defending(int resistancePoints) {
		setResistancePoints(resistancePoints);
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
