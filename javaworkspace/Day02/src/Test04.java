import java.util.Scanner;

public class Test04 {
	public static void main(String[] args) {
		// ���α׷� ���� ���Ŀ� Ű����κ��� �Է°��� �޴� ��ü
		Scanner input = new Scanner(System.in); 
		
		int x, y, sum;
		
		System.out.println("ù��° ���� �Է�:");
		x = input.nextInt(); // Ű����� ���� �Է¹޴� Ÿ�̹�
		System.out.println("�ι�° ���� �Է�:");
		y = input.nextInt(); // Ű����� ���� �Է¹޴� Ÿ�̹�		
		
		sum = x+y;
		System.out.println("����� : " + sum);
	}
}
