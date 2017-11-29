package test01;

public class Test {

	public static void main(String[] args) {
		System.out.println("Â÷·® °¹¼ö : "+ Car.getNumOfCars() );
		
		Car c1 = new Car(100,"red","sonata");
		System.out.println("Â÷·® °¹¼ö : "+ c1.getNumOfCars() );
		
		Car c2 = new Car(10,"ÆÄ¶û","a9");
		System.out.println("Â÷·® °¹¼ö : "+ c2.getNumOfCars() );
		
		System.out.println("2ÀÇ 8Á¦°ö : "+ Math.pow(2, 8));
		
		System.out.println("add(5,6) = "+ add(5,6));
	}
	
	
	static int add(int a, int b){
		return a+b;
	}

}
