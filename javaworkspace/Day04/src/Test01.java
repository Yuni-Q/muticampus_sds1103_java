import java.util.Scanner;

public class Test01 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in); 
		int score;

		System.out.println("당신의 점수를 입력하시오.:");
		score = scan.nextInt();

		if (100 >= score && score >= 90) {
			System.out.println("당신의 성적은 A 입니다.");
		}
		if (90 > score && score >= 80) {
			System.out.println("당신의 성적은 B 입니다.");
		}
		if (80 > score && score >= 70) {
			System.out.println("당신의 성적은 C 입니다.");
		}
		if (70 > score && score >= 60) {
			System.out.println("당신의 성적은 D 입니다.");
		}
		if (60 > score && score >= 0) {
			System.out.println("당신의 성적은 F 입니다.");
		}
	}
}
