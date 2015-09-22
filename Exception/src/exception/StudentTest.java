package exception;

import junit.framework.TestCase;
import logging.MyLogger;

public class StudentTest extends TestCase{
	MyLogger myLogger = MyLogger.getLogger();
	
	public void testStudent(){
	
		String name = null;
		try{
			Student student = new Student(name);
			fail();
		}catch(StudentNameFormatException e){
			myLogger.warning(e.getMessage());
			assertEquals("name must not be null", e.getMessage());
		}
		
		try{
			Student student = new Student("a b c d e");
			fail();
		}catch(StudentNameFormatException e){
			myLogger.warning(e.getMessage());
			assertEquals("Too many arguments", e.getMessage());
		}
		
		Student student = new Student("James");
		assertEquals("James", student.getStudentName());
			
	}
}
