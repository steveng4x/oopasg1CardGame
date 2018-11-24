
public class pokemon {
	
	private String name;
	private int hp;
	private int stage;
	private int energy;
	private int exp;
	private String element;
	private String type;
	private String moves;
	private String status;
	
	
	@Override
	public String toString() {
		return "pokemon [name=" + name + ", hp=" + hp + ", stage=" + stage + ", energy=" + energy + ", exp=" + exp
				+ ", element=" + element + ", type=" + type + ", moves=" + moves + ", status=" + status + "]";
	}


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


	public pokemon(String name, int hp, int stage, int energy, int exp, String element, String type, String moves,
			String status) {
		super();
		this.name = name;
		this.hp = hp;
		this.stage = stage;
		this.energy = energy;
		this.exp = exp;
		this.element = element;
		this.type = type;
		this.moves = moves;
		this.status = status;
	}
	
}
