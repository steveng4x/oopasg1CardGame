
public class Attacking {
	private int attackingPoints;

	public Attacking(int attackingPoints) {
		super();
		this.attackingPoints = attackingPoints;
	}

	@Override
	public String toString() {
		return "Attacking [attackingPoints=" + attackingPoints + "]";
	}

	public int getAttackingPoints() {
		return attackingPoints;
	}

	public void setAttackingPoints(int attackingPoints) {
		this.attackingPoints = attackingPoints;
	}


	}

