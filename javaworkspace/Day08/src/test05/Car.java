package test05;

public class Car {
	private double speed;
	private String color;
//////////////////////////////////////////////////////////////
	public Car(){		
	}
	
	public void speedUp(int s){
		System.out.println("���� ���� speedUp�� �����");
		speed += s;
	}
	
	public void speedUp(double s){
		System.out.println("�Ǽ� ���� speedUp�� �����");
		speed += s;
	}
	
	
	public void setColor(String color) {
		this.color = color;
	}
	@Override
	public String toString() {
		return "�ӵ�:"+speed+",����:"+color;
	}
	
}
