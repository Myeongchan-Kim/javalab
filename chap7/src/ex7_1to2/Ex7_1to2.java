package ex7_1to2;

public class Ex7_1to2 {

	public static void main(String[] args) {
		SutdaDeck deck= new SutdaDeck();
		
		//print a whole deck.
		for( int i=0; i<deck.cards.length; i++)
			System.out.print(deck.cards[i]+", ");
		System.out.println();

		System.out.println("cards[0] :"+deck.pick(0));
		System.out.println("cards[R] :"+deck.pick());
		System.out.println("cards[R] :"+deck.pick());
		deck.shuffle();
		
		//print a whole deck
		for( int i=0; i<deck.cards.length; i++)
			System.out.print(deck.cards[i]+", ");
		System.out.println();
		
		System.out.println("cards[0] :"+deck.pick(0));
	}

}
