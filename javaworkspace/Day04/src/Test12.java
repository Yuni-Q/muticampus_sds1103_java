
// 100 이하의 양수 중 짝수의 합을 구하는 프로그램을 작성하시오.
public class Test12 {
	public static void main(String[] args) {
		int sum = 0;
///////////////////////////////////////////////////////////		
//		방법1
//		for(int i=1; i<=100; i++){
//			if(i%2 == 0){
//				sum += i;
//			}
//		}
////////////////////////////////////////////////////////////
//		방법2
		for (int i = 2; i <= 100; i = i + 2) {
			sum += i; // sum = sum+i;
		}
		System.out.println("100 이하 짝수의 합 : "+ sum);
////////////////////////////////////////////////////////////
	}
}
