import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class BankAccountTest {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String name, pw;
		int money;
		BankAccount account; // 객체 참조변수 만들기
		Map<String, BankAccount> accounts = new HashMap<>(); // 계좌 객체 여러개 관리할 맵
		
		while (true) {
			System.out.println("\n -- 1:가입 2:입금 3:출금 4:송금 5:계좌조회 6:계좌해지 -1:종료 -- ");
			System.out.print(" -- select >");
			int select = scan.nextInt();

			if (select == -1)
				break;

			switch (select) {
			case 1: // 가입
				System.out.print("이름 입력:");
				name = scan.next();
				System.out.print("비밀번호 입력:");
				pw = scan.next();
				System.out.print("초기금액:");
				money = scan.nextInt();
				
				account = new BankAccount(name, pw, money);
				// <계좌번호, 계좌객체> 를 맵에 추가시키기
				accounts.put(account.getAccountNumber(), account);
				account.printAccount(); // 방금 생성된 계좌정보 조회
				break;
			case 2: // 입금
				account = accounts.get("11112");
				break;
			case 3: // 출금
				
				break;
			case 4: // 송금
				
				break;
			case 5: // 계좌 조회
				
				break;
			case 6: // 계좌 해지
				
			default:
				System.out.println("입력이 잘못되었습니다.");
			}
		}
	}
}
