package maze.playerSet;

import maze.Position;

public interface DirectionSet {
	public Position firstDirection();
	public Position nextDirection(Position curDir);
	public boolean isFinalDirection(Position curDir);
}