package thread;

public class PriorityTest extends Thread{
	int sum;
	
	public void run(){
		
		//Thread t = Thread.currentThread();
		
		System.out.println(getName() + ", " + this.getPriority() + ", start");
		
		for(int i=0; i<10000; i++){
			sum +=1;
			
			
			try {
				sleep(1);
				//sleep(1);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println(getName() + ", prior: " + this.getPriority() + ", end");
	}

	public static void main(String[] args) {
		
		PriorityTest ptMin = new PriorityTest();
		ptMin.setPriority(Thread.MIN_PRIORITY);
		ptMin.start();
		PriorityTest ptMax = new PriorityTest();
		ptMax.setPriority(Thread.MAX_PRIORITY);
		ptMax.start();
		
	}

}
