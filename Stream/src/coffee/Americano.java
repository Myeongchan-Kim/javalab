package coffee;

public class Americano extends Coffee{
	String coffeeType ;
	
	public Americano(){
		coffeeType = "�Ƹ޸�ī��";
	}
	
	@Override
	public void brewing() {
		System.out.println("���ۺ���..."+coffeeType);
		
	}

}
