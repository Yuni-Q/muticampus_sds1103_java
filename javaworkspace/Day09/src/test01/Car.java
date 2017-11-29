package test01;

public class Car {
	private static int numOfCars = 0;
	
	// �������
	private int speed;
	private String color;
	private String model;
//////////////////////////////////////////////////////////////
	// ������
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
	// ����޼ҵ�
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
		System.out.println("�ӵ�:"+speed);
		System.out.println("����:"+color);
		System.out.println("��:"+model);
	}

}
