import java.util.Scanner;

public class Test11 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int dan;
		
		System.out.print("��� ����ұ�� ? ");
		dan = scan.nextInt();
		
		for(int i=1; i<10; i++){
			System.out.println(dan+ "x" +i+ "=" +(dan*i));
		}
	}
}