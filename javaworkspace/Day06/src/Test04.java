
public class Test04 {
	public static void main(String[] args) {
		int[] numbers = new int[3];
		
		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		
		int sum = numbers[0]+numbers[1]+numbers[2];
		double avg = sum/3;
		
		System.out.println("ÇÕ°è:"+sum);
		System.out.println("Æò±Õ:"+avg);
	}
}
