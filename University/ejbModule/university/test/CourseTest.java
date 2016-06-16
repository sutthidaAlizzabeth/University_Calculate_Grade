/**
 * 
 */
package university.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import univesity.calculation.Course;

/**
 * @author Alizzabeth
 *
 */
public class CourseTest {
	
	Course course = new Course();
	String subjectId = "INT102";
	String subjectName = "Java Programming";
	int credit = 3;
	String grade = "B+";

	/**
	 * Test method for {@link univesity.calculation.Course#setSubjectId(java.lang.String)}.
	 * Test method for {@link univesity.calculation.Course#getSubjectId
	 */
	@Test
	public void testSubjectId() {
		course.setSubjectId(subjectId);
		assertEquals(subjectId, course.getSubjectId());
	}

	/**
	 * Test method for {@link univesity.calculation.Course#setSubjectName(java.lang.String)}.
	 * Test method for {@link univesity.calculation.Course#getSubjectName
	 */
	@Test
	public void testSubjectName() {
		course.setSubjectName(subjectName);
		assertEquals(subjectName, course.getSubjectName());
	}

	/**
	 * Test method for {@link univesity.calculation.Course#setCredit(int)}.
	 * Test method for {@link univesity.calculation.Course#getCredit
	 */
	@Test
	public void testCredit() {
		course.setCredit(credit);
		assertEquals(credit, course.getCredit());
	}

	/**
	 * Test method for {@link univesity.calculation.Course#setGrade(java.lang.String)}.
	 * Test method for {@link univesity.calculation.Course#getGrade
	 */
	@Test
	public void testGrade() {
		course.setGrade(grade);
		assertEquals(3.5 , course.getGrade(), 0);
	}
	
	public static void main(String[] args){
		Result result = JUnitCore.runClasses(CourseTest.class);
		
		for(Failure fail : result.getFailures()){
			System.out.println(fail.toString());
		}
		System.out.println(result.wasSuccessful());
	}

}
