package test04;

public class Car {
	private int speed;
	private String color;
	private String model;
////////////////////////////////////////////////////////////////	
	public Car(){
		speed = 0;
		color = "WHITE";
		model = "SONATA";
	}
	
	public Car(int speed, String color, String model){
		this.speed = speed;
		this.color = color;
		this.model = model;		
	}
////////////////////////////////////////////////////////////////	
	public void printInfo(){
		System.out.println("현재속도:"+speed);
		System.out.println("색상:"+color);
		System.out.println("모델명:"+model);
	}
}
