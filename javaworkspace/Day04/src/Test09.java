import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
		int x, y, r;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("첫번째 수 입력 : ");
		x = scan.nextInt();
		System.out.print("두번째 수 입력 : ");
		y = scan.nextInt();
		
		while(y != 0){
			r = x%y;
			x = y;
			y = r;
		}
		
		System.out.println("최대공약수 : "+ x);
	}
}
