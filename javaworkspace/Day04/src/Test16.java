import java.util.Scanner;

public class Test16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		
		// 무한반복으로 입력받다가 0이 입력되면 종료시키는 반복문
		while(true){
			System.out.print("숫자 입력하시오. : ");
			num = scan.nextInt();
			
			if(num==0){
				break;
			}			
		}
		
		System.out.println("프로그램 종료!");
	}
}
