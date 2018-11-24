
public class Attacking extends Pokemon{
	
	private int attackingPoints;
	
	//Constructors
	public Attacking() {
		setAttackingPoints(1);
	}
	
	public Attacking(String name, int hp, int stage, int energy,
			int exp, String element, String type, String moves,
			String status, int attackingPoints) {
		setName(name);
		setHp(hp);
		setStage(stage);
		setStage(energy);
		setExp(exp);
		setElement(element);
		setType(type);
		setMoves(moves);
		setStatus(status);
		setAttackingPoints(attackingPoints);
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

	@Override
	public String toString() {
		return  "Name = " + getName() + ", Hp = " + getHp() + ", Stage = "
				+ getStage() + ", Energy = " + getEnergy() + ", Exp = "
				+ getExp() + ", Element = " + getElement() + ", Type = "
				+ getType() + ", Moves = " + getMoves() + ", Status = "
				+ getStatus() + ", Attack = " + getAttackingPoints();
	}

	//toString
	
	
	//otherMethod
	}

