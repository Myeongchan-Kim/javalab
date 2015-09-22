package coffee;

public class MochaCoffee extends Decorator{
	
	public MochaCoffee(Coffee coffee) {
		super(coffee);
		coffeeType = "��ī";
	}
	
	public void brewing (){
		super.brewing();
		System.out.println("Add Mocha syrup : " +coffeeType + "�� �˴ϴ�.");
	}

}
