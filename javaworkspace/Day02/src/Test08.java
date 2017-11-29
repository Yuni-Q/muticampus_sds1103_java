
// 변수와 상수의 비교
public class Test08 {
	public static void main(String[] args) {
		int num1 = 100;
		final int num2 = 10; // num2 를 상수로 선언
		
		num1 = 200;
		num2 = 20; // 상수는 대입연산 불가!
		
		System.out.println(num1);
		
		final int STUDENT_COUNT = 24;
	}
	// final 상수를 사용하는 이유
	// (1) 프로그램 중간에 사용되는 데이터의 의미를 명확히 하기 위해
	// (2) 확장성을 위해
	//	   ex) 학생수 24를 그냥 24로 여러번 쓰면 학생 수 변경시
	//		  24라는 숫자를 다 찾아서 변경해줘야 함.	  
}
