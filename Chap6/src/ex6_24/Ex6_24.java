package ex6_24;

public class Ex6_24 {
	
	static int abs(int val){
		if(val<0) return -val;
		else return val;
	}
	
	public static void main(String[] args) {
		int value = 5;
		System.out.println(value+"의 절대값 \t:"+ abs(value));
		
		value = -10;
		System.out.println(value+"의 절대값 \t:"+ abs(value));
	}

}
