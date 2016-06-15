/**
 * 
 */
package univesity.calculation;

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
	
	public void setGrade(String gradeStr){
		switch (gradeStr) {
		case "A":
			grade = 4;
			break;
		case "B+" :
			grade = 3.5;
		case "B" :
			grade = 3;
		case "C+" :
			grade = 2.5;
		case "C" :
			grade = 2;
		case "D+" :
			grade = 1.5;
		case "D" :
			grade = 1;
		case "F" :
			grade = 0;
		default:
			break;
		}
	}
	
	public double getGrade(){
		return grade;
	}

}
