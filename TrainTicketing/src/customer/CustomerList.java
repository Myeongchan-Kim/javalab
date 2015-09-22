package customer;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import customer.Customer.Status;
import ticketBox.Platform;
import ticketBox.Row;
import ticketBox.RowForTicket;

@SuppressWarnings("serial")
public class CustomerList extends Row {
	int totalWait=0;
	int totalWaitForTicket=0;
	int totalWaitForTrain=0;

	public CustomerList(String fileName) {

		String line = "";
		String cvsSplitBy = ","; //separator
		String csvFile = fileName;
		BufferedReader br = null;
		
		try {
			//id,name,onTime,ticketingTime,arrival,destination
			
			br = new BufferedReader(new FileReader(csvFile));
			while ((line = br.readLine()) != null) {
				
			    String[] words = line.split(cvsSplitBy); //',' is separator
			    if(words[0].equals("id"))
			    	continue; //skip first line
			   
			    this.add(new Customer( 	Integer.parseInt(words[0]), // id 
										words[1], //name
										Integer.parseInt(words[2]), //on time
										Integer.parseInt(words[3]), //ticketing time
										words[4], words[5] //arrival, destination
										));
			}
	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (br != null) {
				try {
					br.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	
		//System.out.println("File input Done");
	}


	public boolean isAllFinished() {
		Iterator<Customer> i = this.iterator();
		while(i.hasNext()){
			if(i.next().status != Status.finished)
				return false;
		}
		
		showTotalTime();
		return true;
	}
	
	public void showTotalTime() {
		
		Iterator<Customer> i = this.iterator();
		while(i.hasNext()){
			Customer c = i.next();
			totalWaitForTicket += c.waitForTicket;
			totalWaitForTrain += c.waitForTrain;
		}
		totalWait = totalWaitForTicket + totalWaitForTrain;
		
		System.out.println("sum of ticketing time : "+totalWaitForTicket);
		System.out.println("sum of wait for train : "+totalWaitForTrain );
		System.out.println("ToTal wait time : "+ totalWait);
	}


	public void showAllCustomer(){
		Iterator<Customer> i = this.iterator();
		while (i.hasNext()){
			System.out.println(i.next());
		}
	}
	
	public void timeSpend(){
		Iterator<Customer> i = this.iterator();
		while(i.hasNext()){
			i.next().timeSpend();
		}
	}
	
	public void newCustomersCome(RowForTicket ticketRow) {
		Iterator<Customer> i = this.iterator();
		while(i.hasNext()){
			Customer c = i.next();
			if(c.status == Status.notYet && c.onTime < 1){
				c.gotoQue(ticketRow);
			}
		}
	}

	public void finishedCustomersGo() {
		Iterator<Customer> i = this.iterator();
		while(i.hasNext()){
			Customer c = i.next();
			if(c.remainTrip < 1){
				c.finish();
			}
		}
	}	

	public void checkCustomerList() {
		for(int i=0; i< this.size(); i++){
			Customer c = this.get(i);
			c.checkVaild();
		}	
	}
	
	public int getTotalWait() {
		return totalWait;
	}


	public int getTotalWaitForTicket() {
		return totalWaitForTicket;
	}


	public int getTotalWaitForTrain() {
		return totalWaitForTrain;
	}
}
