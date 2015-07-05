package first;

public class ManTest {

	public static void main(String[] args) {

		// lesson 1;
		
		Man leeMan = new Man("이승기");
		//leeMan.height = 180; //it doesn't work. it's private varialbe.
		Man kimMan = new Man("김명");
		
		System.out.println(kimMan.name);
		System.out.println(leeMan.name);
		
		// lesson 2
		Point p1 = new Point();
		Point p2 = new Point();
		
		p1.x = 10;
		p2.x = 20;
		p2 = p1;
		
		System.out.println(p1.x);
		System.out.println(p2.x);
		
		
		//exercise , make James.
		
		Man james = new Man("James");
		james.setAge(40);
		james.setMarried(true);
		james.setNumberOfChildren(3);
		
		System.out.println("Name\t:"+james.getName());
		System.out.println("Age\t:"+james.getAge());
		System.out.println("Marry?\t:"+james.isMarried());
		System.out.println("Child\t:"+james.getNumberOfChildren());
		
	}

}
