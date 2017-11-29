
public class Test07 {
	public static void main(String[] args) {
		// 1번 방법
		int[] numbers = {1,2,3,4,5};
		
		// 2번 방법
		int[] numbers2;
		numbers2 = new int[3];
		
		// 이런건 안됨
		int[] numbers3;
		numbers3 = {10,20,30};
	}
}
