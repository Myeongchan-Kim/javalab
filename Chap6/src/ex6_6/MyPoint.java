package ex6_6;

public class MyPoint {
	int x;
	int y;
	
	public MyPoint (int x, int y){
		this.x = x;
		this.y = y;
	}
	
	public float getDistance(int x2,int y2){
		return (float) Math.sqrt((x-x2)*(x-x2) + (y-y2)*(y-y2));
	}
}
