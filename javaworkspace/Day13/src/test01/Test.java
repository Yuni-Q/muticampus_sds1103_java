package test01;

import java.util.Scanner;

// ���� ó�� ����.
public class Test {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("���� �Է� : ");
		int n1 = sc.nextInt();
		System.out.print("���� �Է� : ");
		int n2 = sc.nextInt();

		int result = n1 / n2;
		System.out.println(n1 + "/" + n2 + "=" + result);
		
		System.out.println("���α׷� ����~~");
	}
}
