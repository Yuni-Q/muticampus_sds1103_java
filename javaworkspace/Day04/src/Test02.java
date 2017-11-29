import java.util.Scanner;

public class Test02 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number;
		
		System.out.println("번호를 입력하세요.:");
		number = scan.nextInt();
		
//		switch (number) {
//		case 0:
//			System.out.println("0을 입력하셨네요.");
//			break;
//		case 1:
//			System.out.println("1을 입력하셨네요.");
//			break;
//		case 2:
//			System.out.println("2을 입력하셨네요.");
//			break;
//		default:
//			System.out.println("많네요..;");
//			break;
//		}
/////////////////////////////////////////////////////////////		
		if (number == 0) {
			System.out.println("0을 입력하셨네요.");
		} else if (number == 1) {
			System.out.println("1을 입력하셨네요.");
		} else if (number == 2) {
			System.out.println("2을 입력하셨네요.");
		} else {
			System.out.println("많네요..;");
		}
		System.out.println("switch-case가 종료되었습니다.");
		System.out.println("프로그램이 종료됩니다.");
	}
}
