package test04;

public class Rectangle extends Shape {
	private int width,height;
	
	public Rectangle(){
		super();
		width = height = 0;
	}
	public Rectangle(int x, int y, int w, int h){
		super(x,y);
		width = w;
		height = h;
	}
///////////////////////////////////////////////////////
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
/////////////////////////////////////////////////////////
	@Override
	public double calcArea() {
		return width*height;
	}	
}
