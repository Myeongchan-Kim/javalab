package birthday;

public class BirthDay {
	private int year;
	private int month;
	private int day;
	
	public BirthDay (int year, int month, int day){
		this.year = year;
		this.month = month;
		this.day = day;
	}
	
	public boolean isVaildDate(){
		//set range roughly
		if(this.year<0) return false;
		if(this.month<1 || this.month >12) return false;
		if(this.day<1 || this.day >31) return false;
		
		switch (this.month){

		//check large month
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				if(this.day <= 31 ) return true;
				else return false;
				
			//check small month without Feb. 
			case 4:
			case 6:
			case 9:
			case 11:
				if(this.day <= 30) return true;
				else return false;
				
			//check Feb. 
			case 2:
				if(isLeapYear(this.year))
				{
					if(this.day <= 29) return true;
					else return false;
				}
				else /*isLeapYear(this.year) == false*/
				{
					if(this.day <= 28 ) return true;
					else return false;
				}
				
			default:
				//wrong input. cannot reach here.
				return false;
		}
		
	}
	
	public boolean isLeapYear(int year){
		if(year % 400 == 0) return true;
		else if(year % 100 == 0) return false;
		else if(year % 4 == 0)return true;
		else return false;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getMonth() {
		return month;
	}

	public void setMonth(int month) {
		this.month = month;
	}

	public int getDay() {
		return day;
	}

	public void setDay(int day) {
		this.day = day;
	}
}