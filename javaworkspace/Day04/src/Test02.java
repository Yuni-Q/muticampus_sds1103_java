import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number;
		
		System.out.println("��ȣ�� �Է��ϼ���.:");
		number = scan.nextInt();
		
//		switch (number) {
//		case 0:
//			System.out.println("0�� �Է��ϼ̳׿�.");
//			break;
//		case 1:
//			System.out.println("1�� �Է��ϼ̳׿�.");
//			break;
//		case 2:
//			System.out.println("2�� �Է��ϼ̳׿�.");
//			break;
//		default:
//			System.out.println("���׿�..;");
//			break;
//		}
/////////////////////////////////////////////////////////////		
		if (number == 0) {
			System.out.println("0�� �Է��ϼ̳׿�.");
		} else if (number == 1) {
			System.out.println("1�� �Է��ϼ̳׿�.");
		} else if (number == 2) {
			System.out.println("2�� �Է��ϼ̳׿�.");
		} else {
			System.out.println("���׿�..;");
		}
		System.out.println("switch-case�� ����Ǿ����ϴ�.");
		System.out.println("���α׷��� ����˴ϴ�.");
	}
}
