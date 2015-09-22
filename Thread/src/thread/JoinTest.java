package thread;

public class JoinTest extends Thread{
	
	int first;
	int last;
	int total;
	
	public JoinTest(int first, int last){
		this.first = first;
		this.last = last;
		this.total = 0;
	}
	
	public void run(){
		for(int i = first ; i <= last ; i++)
			total += i;
	}



	public static void main(String[] args) {
		
		JoinTest j1 = new JoinTest(1, 50);
		JoinTest j2 = new JoinTest(51, 100);
	
		j1.run();
		j2.run();
		
		Thread thread = Thread.currentThread();
		try {
			j1.join();
			thread.interrupt();
			j2.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		int lastTotal = j1.total + j2.total;
		
		System.out.println("j1 total : "+ j1.total);
		System.out.println("j2 total : "+ j2.total);
		
		System.out.println(lastTotal);
	}
}