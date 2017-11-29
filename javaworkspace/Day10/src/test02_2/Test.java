package test02_2;

import test02.SportsCar;

public class Test {
	public static void main(String[] args) {
		SportsCar c = new SportsCar();
		// Car 클래스에서 protected 선언해서 자식클래스인
		// SportsCar는 model에 접근이 가능했지만
		// 객체 외부 참조변수를 이용한 model 접근은 불가능함.
//		c.model = "Audi";
		c.setModel("Audi");
	}
}
