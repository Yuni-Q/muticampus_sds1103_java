package test01;

public class Car {
	public int speed;
	public String color;
	public String model;
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
		System.out.println("����ӵ�:"+speed);
		System.out.println("����:"+color);
		System.out.println("�𵨸�:"+model);
	}
}
