package maze.playerSet;

import maze.Position;

public class FourDirection implements DirectionSet{
	private static final Position EAST 	= new Position (0,1);
	private static final Position WEST	= new Position (0,-1);;
	private static final Position NORTH	= new Position (-1,0);;
	private static final Position SOUTH	= new Position (1,0);;

	private final Position directionSet[] = {
			EAST, 
			SOUTH, 
			NORTH, 
			WEST
	};
	
	
	@Override
	public Position firstDirection() {
		return directionSet[0];
	}

	@Override
	public Position nextDirection(Position curDir) {
		for(int i =0 ; i< directionSet.length; i++){
			if(curDir.equals( directionSet[i] ))
				return directionSet[i+1];
		}
		return null;
	}

	@Override
	public boolean isFinalDirection(Position curDir) {
		if(WEST == curDir) return true;
		else return false;
	}
	
}