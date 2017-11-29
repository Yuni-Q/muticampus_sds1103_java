package test02;

public class Car {
	private int speed;
	protected String model; // 자식은 이 멤버 사용할 수 있게 하겠다.
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
