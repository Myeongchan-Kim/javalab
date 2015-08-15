package maze.playerSet;

import maze.Map;
import maze.Position;
import maze.constant.Geo;

public class Strategy {
	Map map;
	PosStack stack;
	DirectionSet DirSet;
	boolean [][] visited;
	
	public Strategy (Map map, DirectionSet DirSet){
		this.map = new Map(map.getMapInfo(), map.getStart(), map.getGoal());
		this.DirSet = DirSet;
		stack = new PosStack();
		
		//get history map and make clean
		visited = new boolean[map.getMap().length][map.getMap()[0].length];
		for(int i=0; i<visited.length;i++)
			for(int j=0; j<visited[0].length; j++)
				visited[i][j] = false;
	}
	
	boolean isGoal(Position curPos){
		if(curPos.toString().equals(map.getGoal().toString()) )
			return true;
		else return false;
	}
	
	PosWithNext findNextPos(PosWithNext curPos){
		if(curPos == null) return null;
		if(isGoal(curPos) )
			return null;
		
		PosWithNext nextPos;
		int x;
		int y;
		
		do{
			if(curPos.nextDir == null) {
				//if player got here first, set dir to first Direction.
				curPos.nextDir = DirSet.firstDirection();
				nextPos = new PosWithNext( curPos.add(curPos.nextDir));
			}
			else if(DirSet.isFinalDirection(curPos.nextDir)){
				//if there is not to go , you got back to last position of stack.
				nextPos = stack.top();
				break;
			}else{
				curPos.nextDir = DirSet.nextDirection(curPos.nextDir);
				nextPos = new PosWithNext( curPos.add(curPos.nextDir), (Position)null);
			}
			
			x = nextPos.x;
			y = nextPos.y;
		}while(map.getMap()[y][x] == Geo.WALL || visited[y][x] == true);
		
		if(nextPos == null) 
			return curPos; //if next is equal to current, then shout "No exit".
		return new PosWithNext(nextPos);
	}
}
