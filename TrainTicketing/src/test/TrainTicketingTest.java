package test;

import strategy.*;

public class TrainTicketingTest {

	public static void main(String[] args) throws InterruptedException {

		TestModule test1 = new TestModule("CustomerTable.csv", new Strategy_FIFO());
		TestModule test2 = new TestModule("CustomerTable.csv", new Strategy_random());
		TestModule test3 = new TestModule("CustomerTable.csv", new Strategy_SJF());
		
		test1.start();
		test2.start();
		test3.start();
		
	}

}
