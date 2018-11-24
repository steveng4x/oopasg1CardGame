
public class Attacking extends Pokemon{
	
	private int attackingPoints;
	
	//Constructors
	public Attacking() {
		setAttackingPoints(1);
	}
	
	public Attacking(int attackingPoints) {
		this.attackingPoints = attackingPoints;
	}
	
	//Setters//Getters
	/**
	 * @return
	 */
	public int getAttackingPoints() {
		return attackingPoints;
	}

	public void setAttackingPoints(int attackingPoints) {
		this.attackingPoints = attackingPoints;
	}

	//toString
	@Override
	public String toString() {
		return "Attacking [attackingPoints=" + attackingPoints + "]";
	}
	
	//otherMethod
	}

