import java.io.Serializable;

public class Scoreboard implements Serializable{

	private int score;
    private String naam;
    
    //Constructors
    public Scoreboard(String naam, int score) {
        this.score = score;
        this.naam = naam;
    }
    
    //Setters//Getters
    public int getScore() {
        return score;
    }

    public String getNaam() {
        return naam;
    }
}

