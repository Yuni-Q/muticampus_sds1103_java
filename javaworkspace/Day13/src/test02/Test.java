package test02;

import java.util.Scanner;

// ArithmeticException ���ܸ� ó���� ���α׷�
public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է� : ");
		int n1 = sc.nextInt();
		System.out.print("���� �Է� : ");
		int n2 = sc.nextInt();

		try {
			int result = n1 / n2;
			System.out.println(n1 + "/" + n2 + "=" + result);
		} catch (ArithmeticException ex) {
			System.out.println("0���� ������� �Ұ��� �մϴ�.");
		}
		
		System.out.println("���α׷� ����~~");
	}
}
