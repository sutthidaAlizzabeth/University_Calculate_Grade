/**
 * 
 */
package university.person;

import javax.ejb.Local;
import javax.ejb.Remote;

/**
 * @author Alizzabeth
 *
 */
@Local
public interface Person{
	final static String university = "KMUTT";
	
	public void setId(String id);
	public String getId();
	public void setFname(String fname);
	public String getFname();
	public void setLname(String lname);
	public String getLname();
	public void setFullName(String fname, String lname);
	public String getFullName();
	public void setDept(String dept);
	public String getDept();
	public void setYear(String year);
	public String getYear();
}
