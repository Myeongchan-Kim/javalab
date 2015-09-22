package ticketBox;

import java.util.ArrayList;

import customer.Customer;

public class Row extends ArrayList<Customer>{
	
	public Customer pop(Customer c){
		if(isEmpty())
			return null;
		remove(c);
		return c;
	}

}
