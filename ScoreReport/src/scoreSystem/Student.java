package scoreSystem;

import java.util.ArrayList;

public class Student {
	String name;
	int id;
	Subject major;
	ArrayList<Subject> subList =new ArrayList<Subject>();
	
	public Student(){
		subList.add(new Math());
		subList.add(new English());
	}
	
	public Student(String name, int id){
		this();
		this.name 	= name;
		this.id 	= id;
	}
	
	public Student(String name,  int id, String majorName){
		this(name, id);
		
		Subject sub = findSubject(majorName);
		this.major 	= sub;
	}
	
	
	public Student(String name,  int id, Subject major){
		this(name, id);
		int majorIdx = subList.indexOf(major);
		this.major 	= subList.get(majorIdx);
	}
	
	public void addScore(String subName, int score){
		Subject tmp = this.findSubject(subName);
		if(tmp == null ) return;
		
		int subIdx = subList.indexOf(tmp);
		tmp.score = score;
		//System.out.print("addScore");
		//System.out.println(""+this.name+subIdx+tmp+tmp.score);
		
		subList.set(subIdx, tmp);
		
		//System.out.print("addScore");
		//this.printGrade();
	}

	public Subject findSubject(String subName){
		for(int i=0; i< subList.size(); i++){
			Subject sub = subList.get(i);
			if(sub.name == subName)
				return sub;
		}
		return null;
	}
	
	public void printGrade(){
		System.out.print("이름 : "+ this.name+"("+this.major+")");
		for(int j = 0 ; j < this.subList.size() ; j++){
			Subject subj = this.subList.get(j);
			System.out.print("\t"+subj.name+": "+subj.score+" 학점:"+subj.grade);
		}
		System.out.println("");
	}
	
	public String toString(){
		return this.name;
	}
}
