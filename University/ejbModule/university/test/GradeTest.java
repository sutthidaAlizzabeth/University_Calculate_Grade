/**
 * 
 */
package university.test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

import univesity.calculation.Course;
import univesity.calculation.Grade;

/**
 * @author Alizzabeth
 *
 */
public class GradeTest {
	

	/**
	 * Test method for {@link univesity.calculation.Grade#getGPA()}.
	 */
	@Test
	public void testGPA() {
		List<Course> course = new ArrayList<Course>();
		Course c;
		
		for(int i = 1 ; i <= 3 ; i++){
			c = new Course();
			c.setSubjectId("INT10" + i);
			c.setSubjectName("Java Programming " + i);
			c.setCredit(3);
			c.setGrade("B+");
			course.add(c);
		}
		
		assertEquals(3.5, Grade.getGPA(course) , 0.0);
	}
	
	public static void main(String[] args){
		Result result = JUnitCore.runClasses(GradeTest.class);
		
		for(Failure fail : result.getFailures()){
			System.out.println(fail.toString());
		}
		
		System.out.println(result.wasSuccessful());
	}

}
