import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		int score;

		System.out.println("����� ������ �Է��Ͻÿ�.:");
		score = scan.nextInt();

		if (100 >= score && score >= 90) {
			System.out.println("����� ������ A �Դϴ�.");
		}
		if (90 > score && score >= 80) {
			System.out.println("����� ������ B �Դϴ�.");
		}
		if (80 > score && score >= 70) {
			System.out.println("����� ������ C �Դϴ�.");
		}
		if (70 > score && score >= 60) {
			System.out.println("����� ������ D �Դϴ�.");
		}
		if (60 > score && score >= 0) {
			System.out.println("����� ������ F �Դϴ�.");
		}
	}
}
