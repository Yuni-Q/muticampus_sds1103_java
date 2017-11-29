import java.util.Scanner;

public class Test05 {
	public static void main(String[] args) {
		final int NUMBER_COUNT = 3;
		int[] numbers = new int[NUMBER_COUNT];
		Scanner scan = new Scanner(System.in);
		
		// fill array
		for(int i=0; i<NUMBER_COUNT; i++){
			System.out.print("숫자입력:");
			numbers[i] = scan.nextInt();
		}
		
		int sum = 0;
		double avg = 0;
		
		// calc sum
		for(int i=0; i<NUMBER_COUNT; i++){
			sum += numbers[i];
		}
		
		avg = sum/(double)NUMBER_COUNT;
		System.out.println("합계="+sum);
		System.out.println("평균="+avg);
	}
}
