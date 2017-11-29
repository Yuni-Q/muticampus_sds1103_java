
public class Test04 {
	public static void main(String[] args) {
		int num = 1;
		char ch = 'b';
		String str = "apple";
		
		switch(num){
		case 0:
			System.out.println("숫자0");
			break;
		case 1:
			System.out.println("숫자1");
			break;
		}
		
		switch(ch){
		case 'a':
			System.out.println("영문자 a");
			break;
		case 'b':
			System.out.println("영문자 b");
			break;
		}
		
		switch(str){
		case "apple":
			System.out.println("사과");
			break;
		case "banana":
			System.out.println("바나나");
			break;
		}
	}
}
