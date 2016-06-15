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

}
