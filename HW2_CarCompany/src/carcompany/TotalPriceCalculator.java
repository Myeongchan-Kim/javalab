package carcompany;

public class TotalPriceCalculator {
	
	public static int getResult(CarCompany carCom) {
		int result=0;
		for(int i=0; i<carCom.carList.length; i++)
			result += carCom.carList[i].price;
		return result;
	}
}
