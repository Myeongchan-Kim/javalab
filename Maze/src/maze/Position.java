package maze;

public class Position {
	public int x;
	public int y;
	
	public Position(){
		this(0,0);
	}
	
	public Position (int y,int x){
		this.x = x;
		this.y = y;
	}
	
	public Position add(int dy, int dx){
		int x = this.x + dx;
		int y = this.y + dy;
		return new Position(y,x);
	}
	
	public Position add(Position delta){
		Position p = this.add(delta.y, delta.x);
		return p;
	}
	
	public boolean equals(Position pos){
		if(pos.x == this.x && pos.y == this.y)
			return true;
		return false;
	}
	
	
	public String toString(){
		return ""+y+", "+x;
	}
}
