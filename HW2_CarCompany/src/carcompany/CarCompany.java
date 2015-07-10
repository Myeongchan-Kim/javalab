package carcompany;

public class CarCompany {
	private static CarCompany carcom = new CarCompany();
	
	Car[] carList = {	new Sonata(), new Sonata(), new Sonata(), 
						new Grandeur(), new Grandeur(), 
						new Genesis()
					};
	
	private CarCompany(){
		
	}
	
	public void addCar(Car car){
		//this.carList.add(car); //it doesn't work.
	}
	
	public static CarCompany getInstance(){
		if(carcom == null)
			carcom = new CarCompany();
		return carcom;
	}

}
