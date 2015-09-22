package ticketBox;

import java.util.ArrayList;
import java.util.Iterator;

import customer.Customer;
import customer.CustomerList;
import strategy.Strategy;

@SuppressWarnings("serial")
public class TicketCenter extends ArrayList<Ticketer>{
	public int limitOfTickter;
	Strategy strategy;
	
	public TicketCenter (int limitOfTickter, Strategy strategy){
		this.limitOfTickter = limitOfTickter;
		this.strategy = strategy;
		
		for( int i =0; i< limitOfTickter; i++)
			this.add(new Ticketer());
	
	}
	
	public void treatCustomer(Platform platform){
		for( int i= 0 ; i< this.size(); i++){
			this.get(i).treatCustomer(platform);
		}
	}
	
	public boolean add(Ticketer t){
		if(this.size() >= limitOfTickter)
			return false;
		super.add(t);
		return true;
	}

	public void changeCustomer(CustomerList customerList, RowForTicket ticketRow) {
		Row row = strategy.getCustomer(ticketRow, this.size());
		int index = 0;
		int size;
		if(this.size() < ticketRow.size())
			size = this.size();
		else
			size = ticketRow.size();
		
		for(int i = 0; i< size; i++){
			Ticketer ticketer = this.get(i);
			if(row.contains(ticketer.myCustomer))
				continue;
			else{
				ticketer.reciveCustomer(row.get(index), ticketRow);
				index++;
			}
		}
	}
}
