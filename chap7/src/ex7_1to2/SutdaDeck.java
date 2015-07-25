package ex7_1to2;

public class SutdaDeck {
	final int CARD_NUM = 20;
	SutdaCard[] cards = new SutdaCard[CARD_NUM];
	
	SutdaDeck(){
		final int MAX_CARD_NUM = 10;
		
		//make first 1~10 with Kwang.
		for(int i=1; i<=MAX_CARD_NUM; i++ ){
			boolean isKwang = false;
			if(i == 1|| i==3|| i==8)
				isKwang = true;
			cards[i-1] = new SutdaCard(i, isKwang);
		}
		
		//make second 1~10. (normal card)
		for(int i=1; i<=MAX_CARD_NUM; i++ ){
			cards[i-1+MAX_CARD_NUM] = new SutdaCard(i, false);
		}
	}
	
	void shuffle(){
		for(int i=0; i<cards.length*10; i++){
			int i1 = (int) (Math.random()*CARD_NUM);
			int i2 = (int) (Math.random()*CARD_NUM);
			
			SutdaCard tmp = cards[i1];
			cards[i1] = cards[i2];
			cards[i2] = tmp;
		}
	}
	
	SutdaCard pick(int index){
		return cards[index];
	}
	
	SutdaCard pick(){
		int i = (int)(Math.random()*CARD_NUM);
		return pick(i);
	}
}