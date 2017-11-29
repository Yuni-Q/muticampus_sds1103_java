import java.util.Scanner;

public class Test08 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score;

		System.out.println("당신의 점수를 입력하시오.:");
		score = scan.nextInt();

		if (score >= 90) {
			System.out.println("당신의 성적은 A 입니다.");
		} else if (score >= 80) {
			System.out.println("당신의 성적은 B 입니다.");
		} else if (score >= 70) {
			System.out.println("당신의 성적은 C 입니다.");
		} else if (score >= 60) {
			System.out.println("당신의 성적은 D 입니다.");
		} else {
			System.out.println("당신의 성적은 F 입니다.");
		}
	}
}
