package coffee;

public class LatteCoffee extends Decorator{

	public LatteCoffee(Coffee coffee) {
		super(coffee);
		coffeeType = "라뗴";
	}
	
	public void brewing(){
		super.brewing();
		System.out.println("Adding Milk : " + coffeeType + "가 됩니다. ");
	}
}
