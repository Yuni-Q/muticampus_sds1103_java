package test05;

public class Aircon implements Remote{
	private int recentTemp;
	private int hopeTemp;
	
///////////////////////////////////////////////////////	
	@Override
	public void turnOn() {
		System.out.println("������ ����");
	}

	@Override
	public void turnOff() {
		System.out.println("������ ����");
	}

}
