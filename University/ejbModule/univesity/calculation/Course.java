/**
 * 
 */
package univesity.calculation;

import java.util.List;

import javax.ejb.Stateful;

import university.course.Subject;

/**
 * @author Alizzabeth
 *
 */
@Stateful
public class Course implements Subject{
	
	private String subjectId;
	private String subjectName;
	private double credit;
	private double grade;
	private double totalCredit;
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
	public void setCredit(double credit) {
		this.credit = credit;
	}

	@Override
	public double getCredit() {
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
		
		System.out.println("Grade = " + getGrade());
	}
	
	@Override
	public double getGrade(){
		return grade;
	}

	@Override
	public double getTotalCredit() {
		return totalCredit;
	}

	@Override
	public void setTotalCredit(double credit) {
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
	public void calculateGPA(double score, double credit){
		this.gpa = score/credit;
	}


	@Override
	public double getGPA(List<Subject> subject){
		System.out.println("--------------getGPA method-----------------");
		Course c = new Course();
		for (Subject s : subject) {
			System.out.println("--------------subject foreach-----------------");
			c.setTotalCredit(s.getCredit());
			c.setTotalScore(s.getGrade()*s.getCredit());
		}
		c.calculateGPA(c.getTotalScore(), c.getTotalCredit());
		return c.getGPA();
	}
}
