import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score;
		
		System.out.println("당신의 점수를 입력하시오.:");
		score = scan.nextInt();
		
		if(score >= 70){
			System.out.println("당신의 성적은 A 입니다.");
		}else {
			if(score >= 40){
				System.out.println("당신의 성적은 B 입니다.");
			}else{
				System.out.println("당신의 성적은 F 입니다.");
			}
		}
		
	}
}
