package scoreSystem;

public class Main {

	public static void main(String[] args) {
		
		School school = School.getInstance();
		
		/*input text data*/
		school.stuList = new TestData().stlist;
		
		MyReport report = new MyReport();
		report.printStuList();
		
	}

}
