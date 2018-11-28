import java.util.Comparator;

public class ScoreComparator implements Comparator<Scoreboard>{
	
	 public int compare(Scoreboard score1, Scoreboard score2) {

         int sc1 = score1.getScore();
         int sc2 = score2.getScore();

         if (sc1 < sc2){
             return -1;
         }else if (sc1 > sc2){
             return +1;
         }else{
             return 0;
         }
     }
}
