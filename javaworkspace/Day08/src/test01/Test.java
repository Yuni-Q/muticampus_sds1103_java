package test01;

public class Test {
	int speed; // 1번 클래스 멤버변수 == 인스턴스 필드
	
	public static void main(String[] args) {
		int speed=0; // 2번 메소드 내부에 선언된 지역변수
		
		if(speed == 10){
			int age = 20;
			
		}
	}
	
	int add(int a, int b){ // 3번 매개변수 - 지역변수에 포함됨
		int result = a+b; // 2번 지역변수
		return result;
	}
}