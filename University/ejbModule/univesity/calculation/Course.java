/**
 * 
 */
package univesity.calculation;

import java.util.List;

import university.course.Subject;

/**
 * @author Alizzabeth
 *
 */
public class Course implements Subject{
	
	private String subjectId;
	private String subjectName;
	private int credit;
	private double grade;
	private int totalCredit;
	private double totalScore;
	private double gpa;

	@Override
	public void setSubjectId(String id) {
		this.subjectId = id;
	}

	@Override
	public String getSubjectId() {
		return this.subjectId;
	}

	@Override
	public void setSubjectName(String name) {
		this.subjectName = name;
	}

	@Override
	public String getSubjectName() {
		return this.subjectName;
	}

	@Override
	public void setCredit(int credit) {
		this.credit = credit;
	}

	@Override
	public int getCredit() {
		return this.credit;
	}
	
	@Override
	public void setGrade(String gradeStr){
		switch (gradeStr) {
		case "A":
			grade = 4;
			break;
		case "B+" :
			grade = 3.5;
			break;
		case "B" :
			grade = 3;
			break;
		case "C+" :
			grade = 2.5;
			break;
		case "C" :
			grade = 2;
			break;
		case "D+" :
			grade = 1.5;
			break;
		case "D" :
			grade = 1;
			break;
		default:
			grade = 0;
		}
	}
	
	@Override
	public double getGrade(){
		return grade;
	}

	@Override
	public int getTotalCredit() {
		return totalCredit;
	}

	@Override
	public void setTotalCredit(int credit) {
		this.totalCredit += credit;
	}

	@Override
	public double getTotalScore() {
		return totalScore;
	}


	@Override
	public void setTotalScore(double score) {
		this.totalScore += score;
	}
	
	@Override
	public double getGPA(){
		return this.gpa;
	}
	
	@Override
	public void calculateGPA(double score, int credit){
		this.gpa = score/credit;
	}


	@Override
	public double getGPA(List<Subject> subject){
		Grade g = new Grade();
		for (Subject s : subject) {
			g.setTotalCredit(s.getCredit());
			g.setTotalScore(s.getGrade()*s.getCredit());
		}
		g.calculateGPA(g.getTotalScore(), g.getTotalCredit());
		return g.getGPA();
	}
}
