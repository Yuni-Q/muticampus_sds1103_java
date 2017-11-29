import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double radius; // 반지름을 입력받아 저장할 변수
		double perimeter; // 둘레를 계산해서 저장할 변수
		double area; // 넓이를 계산해서 저장할 변수
		
		System.out.println("반지름을 입력하시오 : ");
		radius = scan.nextDouble(); // 프로그램 실행도중 입력받기(실수)
		
		perimeter = 2 * 3.13 * radius;
		area = 3.14 * radius * radius;
		
		System.out.println("둘레 = "+ perimeter);
		System.out.println("넓이 = "+ area);
		
		System.out.println("프로그램이 종료됩니다.");
	}
}
