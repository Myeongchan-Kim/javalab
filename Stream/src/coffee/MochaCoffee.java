package coffee;

public class MochaCoffee extends Decorator{
	
	public MochaCoffee(Coffee coffee) {
		super(coffee);
		coffeeType = "모카";
	}
	
	public void brewing (){
		super.brewing();
		System.out.println("Add Mocha syrup : " +coffeeType + "가 됩니다.");
	}

}
