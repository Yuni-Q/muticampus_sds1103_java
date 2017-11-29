package test01;

public class Car {
	private static int numOfCars = 0;
	
	// 멤버변수
	private int speed;
	private String color;
	private String model;
//////////////////////////////////////////////////////////////
	// 생성자
	public Car(int speed, String color, String model) {
		this.speed = speed;
		this.color = color;
		this.model = model;
		
		numOfCars++;
	}
//////////////////////////////////////////////////////////////
	public static int getNumOfCars() {
		return numOfCars;
	}
	// getter & setter
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
//////////////////////////////////////////////////////////////
	// 멤버메소드
	public void speedUp(){
		this.speed += 10;
	}	
	public void speedUp(int speed){
		this.speed += speed;
	}
	public void speedDown(){
		this.speed -= 10;
	}
	public void speedDown(int speed){
		this.speed -= speed;
	}
	
	public void printCarInfo(){
		System.out.println("속도:"+speed);
		System.out.println("색상:"+color);
		System.out.println("모델:"+model);
	}

}
