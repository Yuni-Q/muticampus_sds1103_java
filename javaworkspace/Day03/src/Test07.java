import java.util.Scanner;

public class Test07 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score;
		
		System.out.println("����� ������ �Է��Ͻÿ�.:");
		score = scan.nextInt();
		
		if(score >= 70){
			System.out.println("����� ������ A �Դϴ�.");
		}else {
			if(score >= 40){
				System.out.println("����� ������ B �Դϴ�.");
			}else{
				System.out.println("����� ������ F �Դϴ�.");
			}
		}
		
	}
}
