package test02;

public class Car {
	private int speed;
	protected String model; // �ڽ��� �� ��� ����� �� �ְ� �ϰڴ�.
	private String color;
////////////////////////////////////////////////////	
	public int getSpeed() {
		return speed;
	}
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
}
