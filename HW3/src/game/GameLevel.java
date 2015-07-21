package game;

public abstract class GameLevel {
	public String name = "Level";
	protected GameLevel(){
	}
	
	public abstract void simpleAttack();
	public abstract void turnAttack();
	public abstract void flyingAttack();
	
	public final void play(){
		System.out.println("\n=+=+=+=+=+=+=+=+=+=+=+=+ "+name+" start +=+=+=+=+=+=+=+=+=+=+=+=");
		
		System.out.print(name+" simple attack \t: ");
		simpleAttack();
		System.out.println();
		
		System.out.print(name+" turn attack \t: ");
		turnAttack();
		System.out.println();
		
		System.out.print(name+" flying attack \t: ");
		flyingAttack();
		System.out.println();
		
		System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-  "+name+" end  -=-=-=-=-=-=-=-=-=-=-=-=\n");
	}
	
}
