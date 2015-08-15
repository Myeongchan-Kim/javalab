package videoshop;

public class VideoShop extends Shop implements IQueue{

	public void enQueue(String title) {
		shelf.add(title);
	}

	public String deQueue() {
		String result = shelf.get(0);
		shelf.remove(0);
		return result;
	}
	
}
