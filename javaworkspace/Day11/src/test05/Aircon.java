package test05;

public class Aircon implements Remote{
	private int recentTemp;
	private int hopeTemp;
	
///////////////////////////////////////////////////////	
	@Override
	public void turnOn() {
		System.out.println("¿¡¾îÄÁ ÄÑÁü");
	}

	@Override
	public void turnOff() {
		System.out.println("¿¡¾îÄÁ ²¨Áü");
	}

}
