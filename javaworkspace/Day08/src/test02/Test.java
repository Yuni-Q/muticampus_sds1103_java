package test02;

public class Test {
	public static void main(String[] args) {
		Car myCar = new Car();

		// 멤버변수 speed는 private 이므로
		// 객체 외부에서 참조변수를 이용한 접근이 불가능 함.
		// myCar.speed = 100;
		
//		myCar.color = "RED";
		myCar.setColor("RED");
		
//		System.out.println("현재 myCar의 색상 : "+ myCar.color);
		System.out.println("현재 myCar의 색상 : "+ myCar.getColor());
		
		myCar.speedUp();
	}
}
