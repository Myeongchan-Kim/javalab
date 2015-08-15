package object;

class Dog{
	String name;
	String type;
	
	public Dog(String name, String type){
		this.name = name;
		this.type = type;
	}

	@Override
	public String toString() {
		return name+", "+type;
	}
	
	
}

public class ObjectTest {
	public static void main (String args[]){
		
		Dog myDog = new Dog("Bow wow","Usual Dog");
		System.out.println(myDog);
		
		String str = new String("aaa");
		System.out.println(str);
		
		Integer i = new Integer(100);
		System.out.println(i);
	}
}
