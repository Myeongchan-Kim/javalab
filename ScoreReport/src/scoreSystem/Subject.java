package scoreSystem;

public class Subject {
	String name;
	static boolean isPF;
	int score;
	char grade;
	
	public Subject (String name){
		this.name = name;
		isPF = false;
	}
	
	public Subject(String name, boolean pf){
		this.name = name;
		Subject.isPF = pf;
	}
	
	public Subject(String name, int score){
		this.name = name;
		this.score = score;
	}
	
	public String toString(){
		return name;
	}
}