package exception;

import logging.MyLogger;

public class Student {
	private String studentName;
	MyLogger myLogger = MyLogger.getLogger();
	
	public Student(String studentName){
		if(studentName == null) 
			throw new StudentNameFormatException("name must not be null");
		if( studentName.split(" ").length > 3)
			throw new StudentNameFormatException("Too many arguments");
		this.studentName = studentName;
	}

	public String getStudentName() {
		myLogger.fine("begin get Student()");
		return studentName;
	}
}
