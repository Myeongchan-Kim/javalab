package coffee;

public class LatteCoffee extends Decorator{

	public LatteCoffee(Coffee coffee) {
		super(coffee);
		coffeeType = "���";
	}
	
	public void brewing(){
		super.brewing();
		System.out.println("Adding Milk : " + coffeeType + "�� �˴ϴ�. ");
	}
}
