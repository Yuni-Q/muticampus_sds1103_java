package test05;

public class Television implements Remote{
	private int channel;
	private int volume;
	
	@Override
	public void turnOn() {
		System.out.println("TV ����");
	}

	@Override
	public void turnOff() {
		System.out.println("TV ����");
	}

}
