
public class Test04 {
	public static void main(String[] args) {
		int num = 1;
		char ch = 'b';
		String str = "apple";
		
		switch(num){
		case 0:
			System.out.println("����0");
			break;
		case 1:
			System.out.println("����1");
			break;
		}
		
		switch(ch){
		case 'a':
			System.out.println("������ a");
			break;
		case 'b':
			System.out.println("������ b");
			break;
		}
		
		switch(str){
		case "apple":
			System.out.println("���");
			break;
		case "banana":
			System.out.println("�ٳ���");
			break;
		}
	}
}
