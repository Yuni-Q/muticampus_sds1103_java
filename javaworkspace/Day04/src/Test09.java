import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
		int x, y, r;
		Scanner scan = new Scanner(System.in);
		
		System.out.print("ù��° �� �Է� : ");
		x = scan.nextInt();
		System.out.print("�ι�° �� �Է� : ");
		y = scan.nextInt();
		
		while(y != 0){
			r = x%y;
			x = y;
			y = r;
		}
		
		System.out.println("�ִ����� : "+ x);
	}
}
