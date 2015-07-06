package birthday;

public class BirthDayTest {

	public static void main(String[] args) {
		BirthDay test1 = new BirthDay(2000, 2, 29);
		BirthDay test2 = new BirthDay(2014, 7, 10);
		BirthDay test3 = new BirthDay(2100, 2, 29);
		
		printIsValidDate(test1);
		printIsValidDate(test2);
		printIsValidDate(test3);
	}
	
	public static void printIsValidDate(BirthDay date){
		if(date.isVaildDate())
			System.out.println(date.getYear() + "-" + date.getMonth() + "-" + date.getDay() + "is vaild.");
		else 
			System.out.println(date.getYear() + "-" + date.getMonth() + "-" + date.getDay() + "is NOT vaild.");		
	}

}
