package ex6_22;

public class Ex6_22 {
	public static boolean isNumber(String str){
		if(str == null || str.length() == 0) return false;
		
		for(int i=0; i< str.length(); i++){
			char c = str.charAt(i);
			if ( c < '0' || c > '9' ) return false;
		}
		//if pass all digit exam, then return true;
		return true;
	}
	
	public static void main(String[] args) {
		
		String str = "0";
		System.out.println(str+" is number? "+isNumber(str));

		str = "1234o";
		System.out.println(str+" is number? "+isNumber(str));
		
		for(int i=0; i<15; i++){
			str = ""+ i;
			if(i<5) str+="c";
			if(i == 13) str=null;
			if(i == 14) str=""; 
			System.out.println(str+" is number? "+isNumber(str));
		}
	}

}
