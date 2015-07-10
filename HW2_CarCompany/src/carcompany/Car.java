package carcompany;

public class Car {
	protected int price = 2000;
	protected String modelName = "Humble car";
	
	public Car(){
	}
	
	public void getDetail(){
		System.out.println("Modelname :"+this.modelName+", price : "+this.price);
	}

}
