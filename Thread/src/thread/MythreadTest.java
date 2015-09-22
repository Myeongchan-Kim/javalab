package thread;

import java.io.IOException;

class MyThread extends Thread{
	boolean flag = false;
	String name;
	
	public MyThread (String name){
		this.name = name;
	}
	//반드시 run을 구현해야함!!!
	@Override
	public void run(){
		
		while(!flag){
			try {
				Thread.sleep(1);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
		}
		System.out.println(name + " terminated");
	
	}
	
	void setFlag(boolean flag){
		this.flag = flag;
	}
}

public class MythreadTest {

	public static void main(String[] args) throws IOException {

		System.out.println("main start");

		MyThread threadA = new MyThread("A");
		MyThread threadB = new MyThread("B");
		MyThread threadC = new MyThread("C");
		
		threadA.start();
		threadB.start();
		threadC.start();
		
		
		int i ;
		while( (i = System.in.read()) != -1){
			char ch = (char)i;
			if(ch == 'A' || ch == 'a' ){
				threadA.setFlag(true);
			}else if(ch == 'B' || ch == 'b'){
				threadB.setFlag(true);
			}else if(ch == 'C' || ch == 'c'){
				threadC.setFlag(true);
			}else if(ch == 'M' || ch == 'm'){
				threadA.setFlag(true);
				threadB.setFlag(true);
				threadC.setFlag(true);
				break;
			}
			
		}
		
		System.out.println(Thread.currentThread().getName()+ " terminated");
		
//		Thread th1 = new Thread(runnable);
//		Thread th2 = new Thread(runnable);
//		
//		th1.start();
//		th2.start();
//		
		//MyThread th1 = new MyThread("t1");
		//MyThread th2 = new MyThread("t2");
		
		//th1.start();
		//th2.start();
		
//		System.out.println("main end");
		
		
	}

}
