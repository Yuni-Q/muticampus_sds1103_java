package test06;

public class Car {
	private int speed;
	private String color;
	private String model;
//////////////////////////////////////////////////	
	public Car(){
		this(0,"red","SONATA");
		System.out.println("기본 생성자가 호출됨!");
//		speed = 0;
//		color = "red";
//		model = "SONATA";
	}
	
	public Car(int speed){
		System.out.println("int 생성자 호출됨!");
		this.speed = speed;
		color = "red";
		model = "SONATA";
	}
	
	public Car(int s, String c, String m){
		System.out.println("int,String,String 생성자 호출됨!");
		speed = s;
		color = c;
		model = m;
	}
}
