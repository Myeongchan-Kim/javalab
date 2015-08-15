package main;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import maze.Map;
import maze.Position;
import maze.playerSet.*;

public class MazeTest {

	public static void main(String[] args) throws IOException{
		Map level1 = new Map(new int[][]{
				{0,1,1,1,0,1,1,1},
				{0,0,0,1,0,0,0,0},
				{1,1,0,0,0,1,0,1},
				{1,1,0,1,1,1,0,1},
				{1,0,0,1,0,0,0,0},
				{0,1,1,1,0,1,1,1},
				{1,0,1,1,0,0,0,0},
				{0,1,1,0,1,1,1,0}
				},new Position(1,1), new Position(8,8));
		level1.printMap();
		
		FileInputStream fis = new FileInputStream("direction.properties");
		Properties prop = new Properties();
		prop.load(fis);
		String dirType = prop.getProperty("DIRECTION_SET");
		
		DirectionSet dirSet;
		
		if(dirType.equals("4"))
			dirSet = new FourDirection();
		else if(dirType.equals("8"))
			dirSet = new EightDirection();
		else if(dirType.equals("Knight"))
			dirSet = new KnightMove();
		else 
			dirSet = null;
		
		if(dirSet != null)
		{
			Player kim = new Player(level1.getStart(), level1, dirSet);
			kim.findRoot();
		}
		
		//Player lee = new Player(level1.getStart(), level1, new EightDirection());
		//lee.findRoot();
	}

}
