package test04;

import java.util.Scanner;

// Exception 참조변수는 모든 예외 객체들의 부모 참조변수라서
// 웬만한 예외 객체는 다 받을 수 있음.
public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("숫자 입력 : ");
			int n1 = sc.nextInt();
			System.out.print("숫자 입력 : ");
			int n2 = sc.nextInt();
			
			int result = n1 / n2;
			System.out.println(n1 + "/" + n2 + "=" + result);
		} catch (ArithmeticException ex) {
			System.out.println("0으로 나누기는 불가능 합니다.");
		} catch (Exception ex){
			System.out.println("0으로 나누기 말고 뭔가 다른 예외상황 발생;;");
		}

		System.out.println("프로그램 종료~~");
	}
}
