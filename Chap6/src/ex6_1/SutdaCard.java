package ex6_1;

public class SutdaCard {
	private int num;
	private boolean isKwang;
	
	public SutdaCard(int num, boolean isKwang){
		this.num = num;
		this.isKwang = isKwang;
	}
	
	public SutdaCard(){
		this.num = 1;
		this.isKwang = true;
	}
	
	public String info(){
		if(this.isKwang) return ""+num+'K';
		else return ""+num;
	}
}
