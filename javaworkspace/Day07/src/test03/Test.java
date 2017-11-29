package test03;

public class Test {
	public static void main(String[] args) {
		Car myCar = new Car(); // °´Ã¼ »ý¼º
		
		myCar.speed = 100;
		myCar.color = "red";
		
		myCar.speedUp(10);
		myCar.speedUp(5);
		
//		String myCarStatus = myCar.toString();
//		System.out.println(myCarStatus);
		System.out.println(myCar.toString());
	}
}
