package game;

import java.util.ArrayList;

public class Player {
	
	private int level;
	private ArrayList<GameLevel> gList = new ArrayList<GameLevel>();
	
	public Player(){
		GameLevel g = GameLevel1.getInstance();
		gList.add(g);
		g = GameLevel2.getInstance();
		gList.add(g);
		g = GameLevel3.getInstance();
		gList.add(g);
		
		this.level = 1;
	}
	
	public void upgradeLevel(){
		if(gList.size() > level)
			level += 1;
		else
			System.out.println("You're already the Maximum level");
	}
	
	private GameLevel getGameLevel(int level){
		if(gList.size() < level){
			System.out.println("Wrong Level.");
			return null;
		}
		else
			return gList.get(level-1);
	}
	
	public void attack(){
		GameLevel g = getGameLevel( this.level );
		g.play();
	}
}
