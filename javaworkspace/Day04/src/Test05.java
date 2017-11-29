import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score;

		System.out.println("당신의 점수는 몇 점 입니까? : ");
		score = scan.nextInt();

		int divideScore = score / 10;

		switch (divideScore) {
		case 10:
		case 9:
			System.out.println("A 입니다.");
			break;
		case 8:
			System.out.println("B 입니다.");
			break;
		case 7:
			System.out.println("C 입니다.");
			break;
		case 6:
			System.out.println("D 입니다.");
			break;
		default:
			System.out.println("F 입니다.");
		}
		
		System.out.println("성적 프로그램을 종료합니다.");
	}
}
