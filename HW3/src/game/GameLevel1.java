package game;

public class GameLevel1 extends GameLevel{
	private static GameLevel1 g1 = new GameLevel1();
	
	private GameLevel1(){
		name += "1";
	}
	
	@Override
	public void simpleAttack() {
		System.out.print("Attack~~!!");
	}

	@Override
	public void turnAttack() {
		System.out.print("I can't.");
	}

	@Override
	public void flyingAttack() {
		System.out.print("I can't either.");
	}
	
	public static GameLevel1 getInstance(){
		if(g1 == null) g1 = new GameLevel1();
		return g1;
	}

}
