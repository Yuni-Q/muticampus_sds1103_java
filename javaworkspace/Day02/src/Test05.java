import java.util.Scanner;

//������ �Է¹޾Ƽ� 10�� ����� ����ϱ�
public class Test05 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int salary; // ������ ������ ����
		int deposit; // 10�� ���� ����� ������ ����
		
		System.out.println("������ �Է��Ͻÿ�.:");
		salary = scan.nextInt(); // ���� �Է� �޴� �κ�
		
		deposit = salary*12*10; // 10�� ����� ���
		
		System.out.println("����� = "+ deposit);
	}
}
