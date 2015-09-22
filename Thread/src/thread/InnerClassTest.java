package thread;

class Outer{
	private int outerI = 100;
	Inner inner;
	
	class Inner{
		
		String str = "hello";
		
		public void test(){
			System.out.println(str);
			System.out.println(outerI);
		}
	}
	
	public Outer(){
		inner = this.new Inner();
		
	}
	
	public void outTest(){
		inner.test();
	}
	
	public Runnable getRunnable(){
		int i = 100;
		
		return new Runnable(){
			
			@Override
			public void run(){
				System.out.println(i);
				System.out.println("runnable");
			}
		};

	}
	
	Runnable runnable = new Runnable(){
		
		@Override
		public void run(){
			
		}
	};
}




public class InnerClassTest {

	public static void main(String[] args){
		Outer outer = new Outer();
//		
//		outer.outTest();
//		
//		Outer.Inner in = outer.new Inner();
//		
//		in.test();
		
		Runnable in = outer.getRunnable();
		in.run();
	}
}
