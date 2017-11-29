import java.util.Scanner;

public class programming4 {

	public static void main(String[] args) {
		double c, f;		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("È­¾¾ ¿Âµµ¸¦ ÀÔ·ÂÇÏ½Ã¿À. : ");
		f = scan.nextInt();
		
		c = (f-32)/9*5;
		
		System.out.println("¼·¾¾¿Âµµ : "+c);

	}

}
