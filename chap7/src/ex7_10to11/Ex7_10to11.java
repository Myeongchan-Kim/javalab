package ex7_10to11;

public class Ex7_10to11 {
	public static void main (String args[]){
		MyTv2 t = new MyTv2();

		t.setChannel(10);
		System.out.println("CH :\t"+t.getChannel());
		t.setVolume(20);
		System.out.println("VOL :\t"+t.getVolume());
		
		t.setChannel(20);
		System.out.println("CH :\t"+t.getChannel());
		
		t.gotoPrevChannel();
		System.out.println("CH :\t"+t.getChannel());
		
		t.gotoPrevChannel();
		System.out.println("CH :\t"+t.getChannel());
		
	}
}
