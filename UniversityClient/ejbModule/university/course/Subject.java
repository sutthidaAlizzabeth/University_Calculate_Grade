/**
 * 
 */
package university.course;

import java.util.List;


/**
 * @author Alizzabeth
 *
 */
public interface Subject {
	public void setSubjectId(String id);
	public String getSubjectId();
	public void setSubjectName(String name);
	public String getSubjectName();
	public void setCredit(double credit);
	public double getCredit();
	public void setGrade(String gradeStr);
	public double getGrade();
	public double getTotalCredit();
	public void setTotalCredit(double credit);
	public double getTotalScore();
	public void setTotalScore(double score);
	public double getGPA();
	public void calculateGPA(double score, double credit);
	public double getGPA(List<Subject> subject);
}
