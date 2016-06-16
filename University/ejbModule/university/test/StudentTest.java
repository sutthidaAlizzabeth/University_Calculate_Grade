/**
 * 
 */
package university.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import univesity.calculation.Student;

/**
 * @author Alizzabeth
 *
 */
public class StudentTest {

	Student st = new Student();
	String id = "56130500076";
	String fname = "Sutthida";
	String lname = "Chonpanichakul";
	String dept = "SIT";
	String year = "3";
	
	/**
	 * Test method for {@link univesity.calculation.Student#setId(java.lang.String)}.
	 * Test method for {@link univesity.calculation.Student#getId()}.
	 */
	@Test
	public void testId() {
		st.setId(id);
		assertEquals(id, st.getId());
	}

	/**
	 * Test method for {@link univesity.calculation.Student#setFname(java.lang.String)}.
	 * Test method for {@link univesity.calculation.Student#getFname()}.
	 */
	@Test
	public void testFname() {
		st.setFname(fname);
		assertEquals(fname, st.getFname());
	}


	/**
	 * Test method for {@link univesity.calculation.Student#setLname(java.lang.String)}.
	 * Test method for {@link univesity.calculation.Student#getLname()}.
	 */
	@Test
	public void testLname() {
		st.setLname(lname);
		assertEquals(lname, st.getLname());
	}


	/**
	 * Test method for {@link univesity.calculation.Student#setFullName(java.lang.String, java.lang.String)}.
	 * Test method for {@link univesity.calculation.Student#getFullName()}.
	 */
	@Test
	public void testFullName() {
		st.setFullName(fname, lname);
		assertEquals(fname + " " + lname, st.getFullName());
	}


	/**
	 * Test method for {@link univesity.calculation.Student#setDept(java.lang.String)}.
	 * Test method for {@link univesity.calculation.Student#getDept()}.
	 */
	@Test
	public void testDept() {
		st.setDept(dept);
		assertEquals(dept, st.getDept());
	}


	/**
	 * Test method for {@link univesity.calculation.Student#setYear(java.lang.String)}.
	 * Test method for {@link univesity.calculation.Student#getYear()}.
	 */
	@Test
	public void testYear() {
		st.setYear(year);
		assertEquals(year, st.getYear());
	}

	public static void main(String[] args){
		Result result = JUnitCore.runClasses(StudentTest.class);
		
		for(Failure fail : result.getFailures()){
			System.out.println(fail.toString());
		}
		System.out.println(result.wasSuccessful());
	}


}
