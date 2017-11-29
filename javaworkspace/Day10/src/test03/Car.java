package test03;

public class Car {
	private int speed;
	private String color;
//////////////////////////////////////////////////////////
//	public Car(){
//		System.out.println("Car() 생성자 호출됨!");
//		speed = 0;
//		color = "WHITE";
//	}
	
	public Car(int speed, String color){
		System.out.println("Car(int,String) 생성자 호출됨!");
		this.speed = speed;
		this.color = color;
	}
}
