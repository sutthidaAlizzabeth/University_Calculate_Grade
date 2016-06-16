/**
 * 
 */
package univesity.calculation;

import java.util.List;

/**
 * @author Alizzabeth
 *
 */
public class Grade {
	
	private int totalCredit;
	private double totalScore;
	private double gpa;
	
	
	public int getTotalCredit() {
		return totalCredit;
	}



	public void setTotalCredit(int credit) {
		this.totalCredit += credit;
	}


	public double getTotalScore() {
		return totalScore;
	}



	public void setTotalScore(double score) {
		this.totalScore += score;
	}
	
	public double getGPA(){
		return this.gpa;
	}
	
	public void calculateGPA(double score, int credit){
		this.gpa = score/credit;
	}


	public static double getGPA(List<Course> course){
		Grade g = new Grade();
		for (Course c : course) {
			g.setTotalCredit(c.getCredit());
			g.setTotalScore(c.getGrade()*c.getCredit());
		}
		g.calculateGPA(g.getTotalScore(), g.getTotalCredit());
		return g.getGPA();
	}
}
