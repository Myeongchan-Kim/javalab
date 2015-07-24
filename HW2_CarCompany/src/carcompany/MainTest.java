package carcompany;

public class MainTest {

	public static void main(String[] args) {
		
		CarCompany carCom = CarCompany.getInstance();
		
		int result = TotalPriceCalculator.getResult(carCom);
		System.out.println("Total price : "+ result);
		
		
	}

}
