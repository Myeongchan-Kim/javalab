package game;

public class GameLevel2 extends GameLevel{
	private static GameLevel2 g2 = new GameLevel2();
	
	private GameLevel2(){
		name += "2";
	}
	@Override
	public void simpleAttack() {
		System.out.print("Attack~kick!");
	}

	@Override
	public void turnAttack() {
		System.out.print("Tuuuuurn Attack~");
	}

	@Override
	public void flyingAttack() {
		System.out.print("Sorry, I can't.");
	}
	
	public static GameLevel2 getInstance(){
		if(g2 == null) g2 = new GameLevel2();
		return g2;
	}

}
