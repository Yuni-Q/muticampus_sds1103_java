import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int score;
		char grade;
		
		System.out.println("����� ������ �� �� �Դϱ�? : ");
		score = scan.nextInt();
		
		if(score >= 50){
			grade = 'A';
		}else{
			grade = 'F';
		}
		
		System.out.println("����� ������"+ grade +" �Դϴ�.");
	}
}
