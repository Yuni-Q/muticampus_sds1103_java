package test05;

import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.print("���� �Է� : ");
			int n1 = sc.nextInt();
			System.out.print("���� �Է� : ");
			int n2 = sc.nextInt();

			int result = n1 / n2;
			System.out.println(n1 + "/" + n2 + "=" + result);
		} catch (ArithmeticException ex) {
			System.out.println("0���� ������� �Ұ��� �մϴ�.");
		} finally {
			System.out.println("�ϴ��� �������� �̹����� �����ϰ� �װڴ�.");
		}

		System.out.println("���α׷� ����~~");
	}
}
