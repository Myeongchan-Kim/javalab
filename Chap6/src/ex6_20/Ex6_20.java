package ex6_20;

public class Ex6_20 {
	
	public static int[] shuffle (int[] origin){
		if(origin == null || origin.length < 1) return origin;
		
		for(int i=0; i<10* origin.length; i++){ //배열 길이의 10배정도 섞어줌.	
			int idx1;
			int idx2;
			//배열 인덱스 하나를 임의로 얻는다.  
			idx1 = (int)(Math.random() * origin.length);
			idx2 = (int)(Math.random() * origin.length);
			
			//첫번째 원소와 random추출된 원소를 swap한다. 
			int tmp = origin[idx1];
			origin[idx1] = origin[idx2];
			origin[idx2] = tmp;
		}
		return origin;
	}

	public static void main(String[] args) {
		int[] original = {1,2,3,4,5,6,7,8,9};
		System.out.println(java.util.Arrays.toString(original));
		
		int[] result = shuffle(original);
		System.out.println(java.util.Arrays.toString(result));
	}

}
