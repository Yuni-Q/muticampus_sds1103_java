package test03;

public class Car {
	private int speed;
	private String color;
//////////////////////////////////////////////////////////
//	public Car(){
//		System.out.println("Car() ������ ȣ���!");
//		speed = 0;
//		color = "WHITE";
//	}
	
	public Car(int speed, String color){
		System.out.println("Car(int,String) ������ ȣ���!");
		this.speed = speed;
		this.color = color;
	}
}
