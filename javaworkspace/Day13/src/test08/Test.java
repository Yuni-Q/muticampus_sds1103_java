package test08;

public class Test {
	public static void main(String[] args) {
		// Thread ��ӹ��� MyThread�� �ٷ� start ��Ű�� ��.
//		MyThread t = new MyThread();
//		t.start();
		
		// Runnable ���� MyThread�� start�� ����.. Thread ��ü ����
		// MyThread ��ü�� �����ؾ� start�� ������.
		Thread t = new Thread(new MyThread());
		t.start();
		
		for(int i=0; i<1000000; i++){
			System.out.println("main i:"+i);
		}
	}
}
