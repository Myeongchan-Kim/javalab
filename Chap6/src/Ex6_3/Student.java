package Ex6_3;

public class Student {
	public String name;
	public int ban;
	public int no;
	public int kor;
	public int eng;
	public int math;
	public Student(){
		;
	}
	public Student(String name, int ban, int no, int kor, int eng, int math){
		this.name = name;
		this.ban = ban;
		this.no = no;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	public int getTotal(){
		return kor+math+eng;
	}
	public float getAverage(){
		float result = getTotal()/3.0f;
		return Math.round(result * 10f)/10f;
	}
	
	public String info(){
		return name+", "+ban+", "+no+", "+kor+", "+eng+", "+math+", "+getTotal()+", "+getAverage();
	}
}
