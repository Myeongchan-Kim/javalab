package coffee;

public class CoffeeTest {

	public static void main(String[] args) {
		Coffee americano = new Americano(); //make Americano
		americano.brewing();
		
		Coffee latte = new LatteCoffee(new Americano()); //add milk
		latte.brewing();
		
		Coffee mocha = new MochaCoffee(new LatteCoffee(new Americano()) ); //add mocha syrup
		mocha.brewing();

	}

}
