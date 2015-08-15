package maze.playerSet;

import maze.Map;
import maze.Position;

public class Player {
	PosWithNext curPos;
	Strategy s;
	
	public Player(Position initPos, Map map, DirectionSet DirSet){
		curPos = new PosWithNext(initPos);
		s = new Strategy( map , DirSet);
		curPos.nextDir = null;
		System.out.println("Player created");
	}
	
	public Player (int y, int x){
		this(new Position(y,x), null, null);
	}
	
	public void findRoot(){
		while(!s.isGoal(curPos)){
			if(moveNext() == false){
				System.out.println("There is no Exit!");
				return;
			}
			//System.out.println("move");
		}
		SayGoal();
		System.out.println("Histroy : (from last)");
		PosWithNext pos;
		while((pos = s.stack.pop()) != null){
			System.out.println(pos);
		}
	}
	
	public boolean moveNext(){
		PosWithNext nextPos = s.findNextPos(curPos);
		if(curPos.toString().equals(nextPos.toString()))
			return false; //for avoid infinite loop.
		if( !s.stack.isEmpty() && nextPos.equals(s.stack.top()) ){
			nextPos = s.stack.pop();
			s.visited[curPos.y][curPos.x] = true;
			System.out.println("move back");
			move(nextPos);
		}
		else {
			s.stack.push(new PosWithNext(curPos));
			s.visited[curPos.y][curPos.x] = true;
			System.out.println(curPos.toString() +"; next:"+curPos.nextDir.toString());
			move(nextPos);
		}
		return true;
	}
	
	public void move(PosWithNext target){
		if(target == null) {
			System.out.println("null target.");
			return;
		}
		if(	target.y >= s.map.getMapHeight()	|| target.y <= 0 ||
			target.x >= s.map.getMapWidth()		|| target.x <= 0){
			System.out.println("out of map.");
			return;
		}
		
		curPos.x = target.x;
		curPos.y = target.y;
		curPos.nextDir = target.nextDir;
		
		//SayPosition();
	}
	
	private void SayPosition(){
		System.out.println("CurPos :" + curPos.toString());
	}
	
	private void SayGoal(){
		SayPosition();
		System.out.println("I got GOAL!");
	}

}
