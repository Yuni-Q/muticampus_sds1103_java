package test02;


public class Test {
	public static void main(String[] args) {
		System.out.println("���α׷��� ���۵˴ϴ�.");
		int n = multi(3); // �޼ҵ� ȣ��
		System.out.println("multi(3) ���� ����� = "+ n);
		
		n = multi(99); // �޼ҵ� ȣ��
		System.out.println("multi(99) ���� ����� = "+ n);
		
		n = add(100,5);
		System.out.println("add(100,5) ���� ����� = "+ n);
		
		gugudan(5); // �޼ҵ� ȣ��
		System.out.println("���α׷��� ����˴ϴ�.");
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
		return; // ��ȯ�� ���� return ������ ���� ����.
	}
}




