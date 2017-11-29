package test03;

public class Car {
	private int speed;
	private String color;
	
	private static int numOfCars;
	
	static{
		numOfCars = 100;
	}
	
	{
		speed = 0;
		color ="WHITE";
	}
}
