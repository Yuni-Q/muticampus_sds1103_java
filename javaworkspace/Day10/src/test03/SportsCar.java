package test03;

public class SportsCar extends Car{
	private boolean turbo;
	
	public SportsCar(){
		// super(); �� �ڵ����� �����־���.
		super(0,"WHITE");
		System.out.println("SportsCar() ȣ���!");
		turbo = true;
	}
	
	public SportsCar(int speed, String color, boolean turbo){
		super(speed, color);
		System.out.println("SportsCar(int,String,boolean) ȣ���!");
		this.turbo = turbo;
	}
}
