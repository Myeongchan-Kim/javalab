package ex6_21;

public class MyTv {
	boolean isPowerOn;
	int channel;
	int volume;
	
	final int MAX_CHANNEL	= 100;
	final int MIN_CHANNEL	= 0;
	final int MAX_VOLUME	= 100;
	final int MIN_VOLUME	= 0;
	
	void turnOnOff(){
		//isPowerOn의 값이 true <-> false로 토글되게...
		if(isPowerOn) isPowerOn = false;
		else isPowerOn = true;
	}
	
	void volumeUp(){
		if(volume < MAX_VOLUME) volume++;
	}
	
	void volumeDown(){
		if(volume > MIN_VOLUME) volume--;
	}
	
	void channelUp(){
		if(channel < MAX_CHANNEL) channel++;
		else channel = MIN_CHANNEL;
	}
	
	void channelDown(){
		if(channel > MIN_CHANNEL) channel--;
		else channel = MAX_CHANNEL;
	}
	
}
