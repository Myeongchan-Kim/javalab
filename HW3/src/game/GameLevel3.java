package game;

public class GameLevel3 extends GameLevel{
	private static GameLevel3 g3 = new GameLevel3();
	
	private GameLevel3(){
		name += "3";
	}
	
	@Override
	public void simpleAttack() {
		System.out.print("Attack, hop , Attack!!!");
	}

	@Override
	public void turnAttack() {
		System.out.print("Suuuuper tuuuuurn Attack~");
	}

	@Override
	public void flyingAttack() {
		System.out.print("FLYTING AAAATTACK!!!!!!!!");
	}
	
	public static GameLevel3 getInstance(){
		if(g3 == null) g3 = new GameLevel3();
		return g3;
	}

}