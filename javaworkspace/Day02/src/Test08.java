
// ������ ����� ��
public class Test08 {
	public static void main(String[] args) {
		int num1 = 100;
		final int num2 = 10; // num2 �� ����� ����
		
		num1 = 200;
		num2 = 20; // ����� ���Կ��� �Ұ�!
		
		System.out.println(num1);
		
		final int STUDENT_COUNT = 24;
	}
	// final ����� ����ϴ� ����
	// (1) ���α׷� �߰��� ���Ǵ� �������� �ǹ̸� ��Ȯ�� �ϱ� ����
	// (2) Ȯ�强�� ����
	//	   ex) �л��� 24�� �׳� 24�� ������ ���� �л� �� �����
	//		  24��� ���ڸ� �� ã�Ƽ� ��������� ��.	  
}
