import java.util.Scanner;

public class Test06 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double radius; // �������� �Է¹޾� ������ ����
		double perimeter; // �ѷ��� ����ؼ� ������ ����
		double area; // ���̸� ����ؼ� ������ ����
		
		System.out.println("�������� �Է��Ͻÿ� : ");
		radius = scan.nextDouble(); // ���α׷� ���൵�� �Է¹ޱ�(�Ǽ�)
		
		perimeter = 2 * 3.13 * radius;
		area = 3.14 * radius * radius;
		
		System.out.println("�ѷ� = "+ perimeter);
		System.out.println("���� = "+ area);
		
		System.out.println("���α׷��� ����˴ϴ�.");
	}
}
