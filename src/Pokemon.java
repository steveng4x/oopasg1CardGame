
public class Pokemon extends Board{
	
	private String name;
	private int hp;
	private int stage;
	private int energy;
	private int exp;
	private String element;
	private String type;
	private String moves;
	private String status;
	private int attackingPoints;
	private int resistancePoints;
	private int staticTimer;
	
	//Constructor
	public Pokemon(String name, int hp, int stage, int energy,
			int exp, String element, String type, String moves,
			String status, int atkordef) {
		setName(name);
		setHp(hp);
		setStage(stage);
		setEnergy(energy);
		setExp(exp);
		setElement(element);
		setType(type);
		setMoves(moves);
		setStatus(status);
		if (type.equals("Attacking")) {
			setAttackingPoints(atkordef);
			setResistancePoints(0);
		}else if (type.equals("Defending")){
			setAttackingPoints(1);
			setResistancePoints(atkordef);
		}
		setStaticTimer(0);
	}//Attacking/Defending
	
	public Pokemon(String name,int hp, int stage,int energy,
			int exp, String element, String type,String moves,String status) {
		setName(name);
		setHp(hp);
		setStage(stage);
		setEnergy(energy);
		setExp(exp);
		setElement(element);
		setType(type);
		setMoves(moves);
		setStatus(status);	
		setAttackingPoints(1);
		setResistancePoints(0);
		setStaticTimer(0);
	}//Fairy
	
	//Setters//Getters
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getStage() {
		return stage;
	}

	public void setStage(int stage) {
		this.stage = stage;
	}

	public int getEnergy() {
		return energy;
	}

	public void setEnergy(int energy) {
		this.energy = energy;
	}

	public int getExp() {
		return exp;
	}

	public void setExp(int exp) {
		this.exp = exp;
	}

	public String getElement() {
		return element;
	}

	public void setElement(String element) {
		this.element = element;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getMoves() {
		return moves;
	}

	public void setMoves(String moves) {
		this.moves = moves;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	public int getAttackingPoints() {
		return attackingPoints;
	}

	public void setAttackingPoints(int attackingPoints) {
		this.attackingPoints = attackingPoints;
	}
	
	public int getResistancePoints() {
		return resistancePoints;
	}

	public void setResistancePoints(int resistancePoints) {
		this.resistancePoints = resistancePoints;
	}
	
	public int getStaticTimer() {
		return staticTimer;
	}
	
	public void setStaticTimer(int turn) {
		this.staticTimer = turn;
	}

	public void decreaseStaticTimer() {
		staticTimer -= 1;
	}
	//toString
	@Override
	public String toString() {
		return  "Name = " + getName() + ", Hp = " + getHp() + ", Stage = "
				+ getStage() + ", Energy = " + getEnergy() + ", Exp = "
				+ getExp() + ", Element = " + getElement() + ", Type = "
				+ getType() + ", Moves = " + getMoves() + ", Status = "
				+ getStatus() + ", Attack = " + getAttackingPoints()
				+ ", Resist = " + getResistancePoints();
	}
	
	public Object[] toObjectArray() {
        return new Object[]{
            getName(),
            getHp(),
            getStage(),
            getEnergy(),
            getExp(),
            getElement(),
            getType(),
            getStatus(),
            getAttackingPoints(),
            getResistancePoints()
        };
	}
	
	//otherMethod
	public void decreaseHp(int hp) {
		setHp(getHp() - hp);
	}
	
	public void increaseHp(int hp) {
		setHp(getHp() + hp);
	}
	
	public void decreaseEnergy(int egy) {
		setEnergy(getEnergy() - egy);
	}
	
	public void increaseEnergy(int egy) {
		setEnergy(getEnergy() + egy);
	}
	
	public void increaseExp(int exp) {
		setExp(getExp() + exp);
	}
	
	public void resetExp() {
		setExp(0);
	}
	
	public void evolve() {
		setStage(getStage() + 1);
	}
}
