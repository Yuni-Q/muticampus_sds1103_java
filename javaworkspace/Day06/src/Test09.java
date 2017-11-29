import java.util.Scanner;

public class Test09 {
	public static void main(String[] args) {
		String[] hexa2bin = { 
				"0000", "0001", "0010", "0011", 
				"0100", "0101", "0110", "0111", 
				"1000", "1001", "1010",	"1011", 
				"1100", "1101", "1110", "1111" };
		char[] charToHex = {
				'0','1','2','3','4','5','6','7','8','9',
				'a','b','c','d','e','f'};
		
		Scanner scan = new Scanner(System.in);
		
		System.out.print("16진수 입력:");
		String hexStr = scan.next();
		
		for(int i=0; i<hexStr.length(); i++){
			char ch = hexStr.charAt(i);
			for(int j=0; j<charToHex.length; j++){
				if(ch == charToHex[j]){
					System.out.print(hexa2bin[j]);
				}
			}
		}

	}
}
