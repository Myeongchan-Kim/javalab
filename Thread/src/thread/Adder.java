package thread;

public class Adder {
	
	public int add(int i, int j){
		return i + j;
	}

	public static void main(String[] args) {
		

		int i = 10;
		int j = 5;
		
		Adder adder  = new Adder();
		int result = adder.add(i,  j);
		
		System.out.println(result);
	}

}