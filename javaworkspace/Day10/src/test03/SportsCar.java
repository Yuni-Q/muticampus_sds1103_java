package test03;

public class SportsCar extends Car{
	private boolean turbo;
	
	public SportsCar(){
		// super(); 를 자동으로 끼워넣었음.
		super(0,"WHITE");
		System.out.println("SportsCar() 호출됨!");
		turbo = true;
	}
	
	public SportsCar(int speed, String color, boolean turbo){
		super(speed, color);
		System.out.println("SportsCar(int,String,boolean) 호출됨!");
		this.turbo = turbo;
	}
}
