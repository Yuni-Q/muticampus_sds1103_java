import java.util.Scanner;

public class Test14 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		
		do{
			System.out.print("숫자를 입력하세요.:");
			num = scan.nextInt();	
		}while(num != 0);
		
		System.out.println("종료!");
	}
}
