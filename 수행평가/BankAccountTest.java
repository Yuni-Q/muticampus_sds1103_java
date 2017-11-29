
public class BankAccountTest {
	public static void main(String[] args) {
		// 프로그램 진행에 필요한 변수 선언
		
		while (true) {
			System.out.println("\n -- 1:가입 2:입금 3:출금 4:송금 5:계좌조회 6:계좌해지 -1:종료 -- ");
			System.out.print(" -- select >");
			int select = input.nextInt();

			if (select == -1)
				break;

			switch (select) {
			case 1: // 가입
				
				break;
			case 2: // 입금
				
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
