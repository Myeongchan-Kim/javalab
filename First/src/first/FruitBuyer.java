package first;

public class FruitBuyer {

	private int money;
	private int numberOfFruits;

	public FruitBuyer(int money){
		this.money = money;
	}
	
	public int getMoney() {
		return money;
	}

	public int getNumberOfFruits() {
		return numberOfFruits;
	}

	public void setNumberOfFruits(int numberOfFruits) {
		this.numberOfFruits = numberOfFruits;
	}
	
	public void buyFruit(FruitSeller seller, int pay){
		int count = seller.sellFruit(pay);
		int rest = pay % seller.getPrice();
		this.numberOfFruits += count;
		this.money -= pay;
		this.money += rest;
		return;
	}

	
}
