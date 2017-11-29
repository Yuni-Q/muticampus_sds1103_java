package test05;

public class Car {
	private double speed;
	private String color;
//////////////////////////////////////////////////////////////
	public Car(){		
	}
	
	public void speedUp(int s){
		System.out.println("정수 버전 speedUp이 실행됨");
		speed += s;
	}
	
	public void speedUp(double s){
		System.out.println("실수 버전 speedUp이 실행됨");
		speed += s;
	}
	
	
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "속도:"+speed+",색상:"+color;
	}
	
}
