package scoreSystem;

import java.util.ArrayList;

public class School {
	
	static final School I = new School();
	
	ArrayList<Student> stuList = new ArrayList<Student>();
	ArrayList<Subject> subList = new ArrayList<Subject>();
	
	private School () {
		this.subList.add(new Math());
		this.subList.add(new English());
	}
	
	public static School getInstance(){
		return I;
	}
	
	public void addStudent(Student s){
		this.stuList.add(s);
	}
	
	public void printAllStu(){
		
	}
}
