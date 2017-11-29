import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		// 프로그램 실행 이후에 키보드로부터 입력값을 받는 객체
		Scanner input = new Scanner(System.in); 
		
		int x, y, sum;
		
		System.out.println("첫번째 숫자 입력:");
		x = input.nextInt(); // 키보드로 숫자 입력받는 타이밍
		System.out.println("두번째 숫자 입력:");
		y = input.nextInt(); // 키보드로 숫자 입력받는 타이밍		
		
		sum = x+y;
		System.out.println("결과는 : " + sum);
	}
}
