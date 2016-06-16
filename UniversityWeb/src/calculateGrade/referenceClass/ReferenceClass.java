/**
 * 
 */
package calculateGrade.referenceClass;

import javax.naming.Context;
import javax.naming.InitialContext;

/**
 * @author Alizzabeth
 *
 */
public class ReferenceClass {
	public static Object refClass(String className) throws Exception{
		Context context = new InitialContext();
		return context.lookup(className);
	}
}
