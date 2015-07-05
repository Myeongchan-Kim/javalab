package first;

public class BuyTest {

	public static void main(String[] args) {
		FruitBuyer	buyer = new FruitBuyer(10000);
		
		FruitSeller	smallSeller = new FruitSeller(100, 20, 0);
		FruitSeller	largeSeller = new FruitSeller(500, 20, 0);

		System.out.println("My money : "+buyer.getMoney());
		System.out.println("My fruits : "+buyer.getNumberOfFruits());
		
		System.out.println("Sell1 m: "+smallSeller.getMoney());
		System.out.println("Sell2 m: "+largeSeller.getMoney());
		
		System.out.println("Sell1 f: "+smallSeller.getNumberOfFruits());
		System.out.println("Sell2 f: "+largeSeller.getNumberOfFruits());
		
		buyer.buyFruit(smallSeller, 1100);
		buyer.buyFruit(largeSeller, 2100);
		
		System.out.println("My money : "+buyer.getMoney());
		System.out.println("My fruits : "+buyer.getNumberOfFruits());
		
		System.out.println("Sell1 m: "+smallSeller.getMoney());
		System.out.println("Sell2 m: "+largeSeller.getMoney());
		
		System.out.println("Sell1 f: "+smallSeller.getNumberOfFruits());
		System.out.println("Sell2 f: "+largeSeller.getNumberOfFruits());
		
		
	}

}
