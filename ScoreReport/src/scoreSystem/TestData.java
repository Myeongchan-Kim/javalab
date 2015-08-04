package scoreSystem;

import java.util.ArrayList;

public class TestData {
	ArrayList<Student> stlist = new ArrayList<Student>();
	
	public TestData(){
		
		Student st1 = new Student("이승기", 141213, "math");
		st1.addScore("math",  95);
		st1.addScore("english",  20);

		this.stlist.add(st1);

		Student st2 = new Student("김수현", 141518, "english");
		st2.addScore("math",  90);
		st2.addScore("english",  100);
		this.stlist.add(st2);
		
		Student st3 = new Student("주 원 ", 141230, "math");
		st3.addScore("math",  76);
		st3.addScore("english",  60);
		this.stlist.add(st3);
		
		Student st4 = new Student("김우빈", 141255, "math");
		st4.addScore("math",  85);
		st4.addScore("english",  89);
		this.stlist.add(st4);
		
		Student st5 = new Student("이민", 141590, "english");
		st5.addScore("math",  90);
		st5.addScore("english",  95);
		this.stlist.add(st5);
		
	}
	
	private void printAllStu(){
		System.out.println("All Student");
		for(int i =0 ; i<stlist.size(); i++){
			Student st =  stlist.get(i);
			st.printGrade();;
		}
		System.out.println("");
	}

}
