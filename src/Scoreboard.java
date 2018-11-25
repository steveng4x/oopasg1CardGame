import java.util.ArrayList;
import java.util.List;

public class Scoreboard {

	private String num1 ;
	private int steps;
	List<String>top10 = new ArrayList<>(10);
	List<Integer>total_step = new ArrayList<>(10);
	
   
	
	public Scoreboard(String num1,int steps){
		for (int x=0; x<=top10.size(); x++) {
			int a = total_step.get(x);
			int nScore = steps;
			if (a < nScore) {
		total_step.set(x,a);
		top10.add(num1);
		total_step.add(steps);
		
			}
			
			int b = top10.size();
			if (b<10){
				top10.add(num1);
				total_step.add(steps);
			}
			
		}
		
	}

	public String getNum1() {
		return num1;
	}



	public void setNum1(String num1) {
		this.num1 = num1;
	}



	public int getSteps() {
		return steps;
	}



	public void setSteps(int steps) {
		this.steps = steps;
	}



	public List<String> getTop10() {
		return top10;
	}



	public void setTop10(List<String> top10) {
		this.top10 = top10;
	}



	public List<Integer> getTotal_step() {
		return total_step;
	}



	public void setTotal_step(List<Integer> total_step) {
		this.total_step = total_step;
	}
}	


