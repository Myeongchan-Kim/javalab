package object;

class MyDate{
	int year;
	int month;
	int day;
	
	MyDate(int day, int month, int year){
		this.day = day;
		this.month = month;
		this.year = year;
	}
	
	public boolean equals(MyDate m){
		if( m.day == this.day && m.month == this.month && m.year == this.year)
			return true;
		else
			return false;
	}
	
	public int hashCode(){
		String str = ""+day+month+year;
		return str.hashCode();
	}
}

public class MyDateTest {

	public static void main(String[] args) {
		
		MyDate m1 = new MyDate(31,7,2015);
		MyDate m2 = new MyDate(31,7,2015);
		
		System.out.println(m1.equals(m2));
		System.out.println(m1.hashCode());
		System.out.println(m2.hashCode());
		
	}

}