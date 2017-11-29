import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankAccountTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name, pw;
		int money;
		BankAccount account; // ��ü �������� �����
		Map<String, BankAccount> accounts = new HashMap<>(); // ���� ��ü ������ ������ ��
		
		while (true) {
			System.out.println("\n -- 1:���� 2:�Ա� 3:��� 4:�۱� 5:������ȸ 6:�������� -1:���� -- ");
			System.out.print(" -- select >");
			int select = scan.nextInt();

			if (select == -1)
				break;

			switch (select) {
			case 1: // ����
				System.out.print("�̸� �Է�:");
				name = scan.next();
				System.out.print("��й�ȣ �Է�:");
				pw = scan.next();
				System.out.print("�ʱ�ݾ�:");
				money = scan.nextInt();
				
				account = new BankAccount(name, pw, money);
				// <���¹�ȣ, ���°�ü> �� �ʿ� �߰���Ű��
				accounts.put(account.getAccountNumber(), account);
				account.printAccount(); // ��� ������ �������� ��ȸ
				break;
			case 2: // �Ա�
				account = accounts.get("11112");
				break;
			case 3: // ���
				
				break;
			case 4: // �۱�
				
				break;
			case 5: // ���� ��ȸ
				
				break;
			case 6: // ���� ����
				
			default:
				System.out.println("�Է��� �߸��Ǿ����ϴ�.");
			}
		}
	}
}
