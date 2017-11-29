package test02;


public class Test {
	public static void main(String[] args) {
		System.out.println("프로그램이 시작됩니다.");
		int n = multi(3); // 메소드 호출
		System.out.println("multi(3) 실행 결과는 = "+ n);
		
		n = multi(99); // 메소드 호출
		System.out.println("multi(99) 실행 결과는 = "+ n);
		
		n = add(100,5);
		System.out.println("add(100,5) 실행 결과는 = "+ n);
		
		gugudan(5); // 메소드 호출
		System.out.println("프로그램이 종료됩니다.");
	}
//////////////////////////////////////////////////////////////////	
	static int multi(int input){
		int result = input * 2;
		return result;
	}
	
	static int add(int a, int b){
		int result = a+b;
		return result;
	}
	
	static void gugudan(int dan){
		for(int i=1; i<=9; i++){
			System.out.println(dan +"x"+ i +"="+ (dan*i));
		}
		return; // 반환값 없는 return 문장은 생략 가능.
	}
}




