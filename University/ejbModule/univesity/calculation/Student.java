/**
 * 
 */
package univesity.calculation;

import javax.ejb.EJB;
import javax.ejb.Stateful;
import javax.ejb.Stateless;

import university.person.Person;

/**
 * @author Alizzabeth
 *
 */
@Stateless
public class Student implements Person{
	
	private String id;
	private String fname;
	private String lname;
	private String dept; //department
	private String year;

	@Override
	public void setId(String id) {
		this.id = id;
	}

	@Override
	public String getId() {
		return this.id;
	}

	@Override
	public void setFname(String fname) {
		this.fname = fname;
	}

	@Override
	public String getFname() {
		return fname;
	}

	@Override
	public void setLname(String lname) {
		this.lname = lname;
	}

	@Override
	public String getLname() {
		return this.lname;
	}

	@Override
	public void setFullName(String fname, String lname) {
		setFname(fname);
		setLname(lname);
	}

	@Override
	public String getFullName() {
		return getFname() + " " + getLname();
	}

	@Override
	public void setDept(String dept) {
		this.dept = dept;
	}

	@Override
	public String getDept() {
		return dept;
	}

	@Override
	public void setYear(String year) {
		this.year = year;
	}

	@Override
	public String getYear() {
		return this.year;
	}

}
