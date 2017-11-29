package test05;



public class Test {
	public static void main(String[] args) {
		////////
		Car c = new Car();
		
		c.speedUp(100);
		c.speedUp(10);
		c.speedUp(5.5);
		
		c.setColor("red");
		System.out.println(c.toString());
		
		Car c2 = new Car();
		
		c = c2;
		System.out.println(c.toString());
	}
}
