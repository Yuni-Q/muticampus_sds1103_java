import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score;

		System.out.println("����� ������ �Է��Ͻÿ�.:");
		score = scan.nextInt();

		if (score>=60 && score<70) {
			System.out.println("����� ������ D �Դϴ�.");
		} else if (score>=70 && score<80) {
			System.out.println("����� ������ C �Դϴ�.");
		} else if (score>=80 && score<90) {
			System.out.println("����� ������ B �Դϴ�.");
		} else if (score>=90 && score<=100) {
			System.out.println("����� ������ A �Դϴ�.");
		} else if (score<60 && score>=0){
			System.out.println("����� ������ F �Դϴ�.");
		} else {
			System.out.println("�� �Է��Ѱų�..?");
		}
	}
}
