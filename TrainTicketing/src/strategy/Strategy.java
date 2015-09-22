package strategy;

import customer.Customer;
import ticketBox.Row;

public interface Strategy {
	public Row getCustomer(Row row, int num);
	public String toString();
}
