/**
 * 
 */
package university.person;

/**
 * @author Alizzabeth
 *
 */
public interface Person {
	final static String university = "KMUTT";
	
	public void setId(String id);
	public String getId();
	public void setFname(String fname);
	public String getFname();
	public void setLname(String lname);
	public String getLname();
	public void setFullName();
	public String getFullName();
	public void setDept(String dept);
	public String getDept();
	public void setYear(String year);
	public String getYear();
}
