package test01;

public class Test {
	public static void main(String[] args) {
		System.out.println("���α׷��� ���۵˴ϴ�.");
		Car myCar = new Car();
		
		myCar.speed = 0;
		myCar.mileage = 10000;
		myCar.color = "RED";
		myCar.model = "sonata";
		
		myCar.speedUp();
		myCar.speedUp();
		
		System.out.println("���� myCar�� �ӵ��� = "+ myCar.speed);
		//////////////////////////////////////////////////////////
		Car secondCar = new Car();
		
		secondCar.speed = 100;
		secondCar.speedUp();
		
		System.out.println("���� secondCar�� �ӵ��� = "+ secondCar.speed);
		
		System.out.println("���α׷��� �����ϴ�.");
	}
}
