import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score;

		System.out.println("����� ������ �� �� �Դϱ�? : ");
		score = scan.nextInt();

		int divideScore = score / 10;

		switch (divideScore) {
		case 10:
		case 9:
			System.out.println("A �Դϴ�.");
			break;
		case 8:
			System.out.println("B �Դϴ�.");
			break;
		case 7:
			System.out.println("C �Դϴ�.");
			break;
		case 6:
			System.out.println("D �Դϴ�.");
			break;
		default:
			System.out.println("F �Դϴ�.");
		}
		
		System.out.println("���� ���α׷��� �����մϴ�.");
	}
}
