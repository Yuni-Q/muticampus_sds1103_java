package test04;

public class Test {
	public static void main(String[] args) {
		int[] numbers = {10,20,30};
		
		makeDouble(numbers);
		
		for(int n: numbers){
			System.out.println(n);
		}
	}
	
	public static void makeDouble(int[] arr){
	
		for(int i=0; i<arr.length; i++){
			arr[i] = arr[i]*2;
		}
	}
}
