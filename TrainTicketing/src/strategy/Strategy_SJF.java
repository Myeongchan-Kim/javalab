package strategy;

import java.util.Iterator;

import customer.Customer;
import ticketBox.Row;

public class Strategy_SJF implements Strategy {
	String name = "SJF";
	
	public String toString(){
		return name;
	}

	@Override
	public Row getCustomer(Row row, int num) {
		Row result = new Row();
		
		if(num > row.size())
			num = row.size();
		
		for(int i=0; i< num; i++)
			findShortestCustomer(row, result);
		
		return result;
	}

	private void findShortestCustomer(Row row, Row result) {
		// find shortest remaining job without Customer is already in result.
		Customer shortest = null;
		Iterator<Customer> i = row.iterator();
		while(i.hasNext()){
			Customer tmp = i.next();
			if(shortest == null)
				shortest = tmp;
			else if(shortest.getTicketingTime() > tmp.getTicketingTime() && !result.contains(tmp))
				shortest = tmp;
		}
		
		result.add(shortest);
	}

}
