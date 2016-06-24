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
	public void setCredit(int credit);
	public int getCredit();
	public void setGrade(String gradeStr);
	public double getGrade();
	public int getTotalCredit();
	public void setTotalCredit(int credit);
	public double getTotalScore();
	public void setTotalScore(double score);
	public double getGPA();
	public void calculateGPA(double score, int credit);
	public double getGPA(List<Subject> subject);
}
