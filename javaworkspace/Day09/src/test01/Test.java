package test01;

public class Test {

	public static void main(String[] args) {
		System.out.println("���� ���� : "+ Car.getNumOfCars() );
		
		Car c1 = new Car(100,"red","sonata");
		System.out.println("���� ���� : "+ c1.getNumOfCars() );
		
		Car c2 = new Car(10,"�Ķ�","a9");
		System.out.println("���� ���� : "+ c2.getNumOfCars() );
		
		System.out.println("2�� 8���� : "+ Math.pow(2, 8));
		
		System.out.println("add(5,6) = "+ add(5,6));
	}
	
	
	static int add(int a, int b){
		return a+b;
	}

}
