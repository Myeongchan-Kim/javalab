package ticketBox;

import customer.Customer;

public class Platform extends Row{
	public void getTrain(Row train){
		while(this.size()>0){
			Customer c= this.get(0);
			c.rideTrain(train);
		}
	}
}
