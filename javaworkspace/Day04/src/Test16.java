import java.util.Scanner;

public class Test16 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num;
		
		// ���ѹݺ����� �Է¹޴ٰ� 0�� �ԷµǸ� �����Ű�� �ݺ���
		while(true){
			System.out.print("���� �Է��Ͻÿ�. : ");
			num = scan.nextInt();
			
			if(num==0){
				break;
			}			
		}
		
		System.out.println("���α׷� ����!");
	}
}
