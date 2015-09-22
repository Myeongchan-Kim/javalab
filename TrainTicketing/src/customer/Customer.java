package customer;

import strategy.TimeTable;
import ticketBox.Platform;
import ticketBox.Row;
import ticketBox.RowForTicket;

public class Customer {

	public enum Status {notYet, onQue, onTicketing, onPlatform, onTrain, finished};
	
	//initial information
	int id ;
	String name ;
	String depart ;
	String dest;
	Row location = null;
	
	//variable information
	Status status = Status.notYet;
	int onTime ;
	int ticketingTime ;
	int waitForTicket = 0;
	int waitForTrain = 0;
	int remainTrip;
	int tripTime = 0;
	
	public Customer(int id, String name, int onTime, int ticketingTime, String depart, String dest ) {
		this.id = id;
		this.name = name;
		this.onTime = onTime;
		this.ticketingTime = ticketingTime;
		this.depart = depart;
		this.dest = dest;
		this.remainTrip = TimeTable.getTripTime(depart, dest);
	}
	
	public boolean isTicketed(){
		if(ticketingTime <= 0)
			return true;
		else
			return false;
	}
	
	public void timeSpend(){
		switch(status){
		case notYet:
			onTime--;
			break;
		case onQue:
			waitForTicket++;
			break;
		case onTicketing:
			waitForTicket++;
			ticketingTime--;
			break;
		case onPlatform:
			waitForTrain++;
			break;
		case onTrain:
			tripTime++;
			remainTrip--;
			break;
		default:
			break;
		}
	}
	

	private void moveTo( Row row ) {
		if(location != null)
			location.remove(this);
		if(row !=null){
			location = row;
			location.add(this);
		}
	}
	
	public boolean gotoQue(RowForTicket row){
		if(onTime >= 1)
			return true;
		status = Status.onQue;
		moveTo(row);
		System.out.println(name+" goes to row for ticket");
		return false;
	}
	

	public boolean gotoTicketer(){
		status = Status.onTicketing;
		System.out.println(name+" meets a ticketer");
		return false;
	}
	
	public boolean gotoPlatform(Platform platform){
		status = Status.onPlatform;
		moveTo(platform);
		System.out.println(name+" goes to Platform");
		return false;
	}
	
	public boolean rideTrain(Row train){
		status = Status.onTrain;
		moveTo(train);
		System.out.println(name+" rides a train.");
		return false;
	}
	
	public boolean finish(){
		if(status != Status.onTrain)
			return true;
		status = Status.finished;
		System.out.println(name+" finnished. byebye~ "+"(Ticket:"+waitForTicket+" train:"+waitForTrain+" Trip time:"+tripTime+")");
		return false;
	}
	

	public void checkVaild() {
		if(location != null && (location.contains(this) == false)){
			System.out.println("err!!!!!!!");
			System.out.println(this);		
		}else if (location == null && (status != Status.finished) && (status != Status.notYet)){
			System.out.println("err!!!!!!!");
			System.out.println(this);
		}
		
	}

	public String toString(){
		return ""+name+"\tTicket wait:"+waitForTicket+"\tTrain wait:"+waitForTrain+"\t("+depart+"->"+dest+")("+tripTime+")";
	}

	
	public int getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDepart() {
		return depart;
	}

	public String getDest() {
		return dest;
	}

	public Row getLocation() {
		return location;
	}

	public Status getStatus() {
		return status;
	}

	public int getOnTime() {
		return onTime;
	}

	public int getTicketingTime() {
		return ticketingTime;
	}

	public int getWaitForTicket() {
		return waitForTicket;
	}

	public int getWaitForTrain() {
		return waitForTrain;
	}

	public int getRemainTrip() {
		return remainTrip;
	}

	public int getTripTime() {
		return tripTime;
	}
	
}
