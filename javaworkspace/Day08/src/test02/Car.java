package test02;

public class Car {
	private int speed = 100;
	private String color = "WHITE";
	private String model = "SONATA";
////////////////////////////////////////////////////////////////
	public void speedUp(){
		speed += 10;
	}
	
	public void speedDown(){
		speed -= 10;
		if(speed<0)
			speed = 0;
	}
	
	public void setColor(String c){
		color = c;
	}
	
	public String getColor(){
		return color;
	}
	
	public String getModel(){
		return model;
	}	
///////////////////////////////////////////////////////////////	
	public String toString(){
		return "속도:"+speed+",색상:"+color+",모델:"+model;
	}
}
