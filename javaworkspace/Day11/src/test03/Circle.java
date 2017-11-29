package test03;

public class Circle extends Shape{
	private int radius;
	
	public Circle(){
		super();
		radius = 0;
	}
	public Circle(int x, int y, int r){
		super(x,y);
		radius = r;
	}
/////////////////////////////////////////////////////////////
	public void setRadius(int radius) {
		this.radius = radius;
	}
	public int getRadius() {
		return radius;
	}
//////////////////////////////////////////////////////////////
	@Override
	public double calcArea() {
		return Math.PI*radius*radius; // 원의 넓이 계산
	}
}
