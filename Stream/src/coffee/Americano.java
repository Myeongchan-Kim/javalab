package coffee;

public class Americano extends Coffee{
	String coffeeType ;
	
	public Americano(){
		coffeeType = "아메리카노";
	}
	
	@Override
	public void brewing() {
		System.out.println("보글보글..."+coffeeType);
		
	}

}
