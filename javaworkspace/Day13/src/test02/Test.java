package test02;

import java.util.Scanner;

// ArithmeticException 예외를 처리한 프로그램
public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("숫자 입력 : ");
		int n1 = sc.nextInt();
		System.out.print("숫자 입력 : ");
		int n2 = sc.nextInt();

		try {
			int result = n1 / n2;
			System.out.println(n1 + "/" + n2 + "=" + result);
		} catch (ArithmeticException ex) {
			System.out.println("0으로 나누기는 불가능 합니다.");
		}
		
		System.out.println("프로그램 종료~~");
	}
}
