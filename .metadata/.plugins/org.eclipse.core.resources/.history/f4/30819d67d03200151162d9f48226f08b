package ex7_18;

public class Ex7_18 {

	static void action (Robot r){
		if(r instanceof DanceRobot){
			DanceRobot d = (DanceRobot)r;
			d.dance();
		}else if (r instanceof SingRobot){
			SingRobot s = (SingRobot) r;
			s.sing();
		}else if (r instanceof DrawRobot){
			DrawRobot d = (DrawRobot)r;
			d.draw();
		}
	}
	
	public static void main(String[] args) {
		Robot[] arr = { new DanceRobot(), new SingRobot(), new DrawRobot()};
		
		for( int i=0; i< arr.length; i++){
			action(arr[i]);
		}
	
	}

}
