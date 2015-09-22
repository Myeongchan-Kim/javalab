package coffee;

public class Decorator extends Coffee{
	Coffee coffee;
	String coffeeType;
	
	public Decorator ( Coffee coffee){
		this.coffee = coffee;
	}

	@Override
	public void brewing() {
		coffee.brewing();
	}
	
}
