import java.util.Scanner;

//월급을 입력받아서 10년 저축액 계산하기
public class Test05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int salary; // 월급을 저장할 변수
		int deposit; // 10년 저축 결과를 저장할 변수
		
		System.out.println("월급을 입력하시오.:");
		salary = scan.nextInt(); // 월급 입력 받는 부분
		
		deposit = salary*12*10; // 10년 저축액 계산
		
		System.out.println("저축액 = "+ deposit);
	}
}
