package test03;

public class Car {
	int speed;
	String color;
////////////////////////////////////////////
	void speedUp(int s){
		speed += s;
	}
	
	void speedDown(int s){
		speed -= s;
	}
	
	public String toString() {
		String status = "�ӵ�:" +speed+ ", ����:" +color;
		return status;
	}
}
