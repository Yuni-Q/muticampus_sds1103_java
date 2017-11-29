import java.util.Scanner;


public class Test06 {
	public static void main(String[] args) {
		int[] numbers = new int[3];
		Scanner scan = new Scanner(System.in);
		
		// fill array
		for(int i=0; i<numbers.length; i++){
			System.out.print("숫자입력:");
			numbers[i] = scan.nextInt();
		}
		
		int sum = 0;
		double avg = 0;
		
		// calc sum
		for(int i=0; i<numbers.length; i++){
			sum += numbers[i];
		}
		
		avg = sum/(double)numbers.length;
		System.out.println("합계="+sum);
		System.out.println("평균="+avg);
	}
}
