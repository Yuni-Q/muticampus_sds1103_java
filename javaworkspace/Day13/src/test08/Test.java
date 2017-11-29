package test08;

public class Test {
	public static void main(String[] args) {
		// Thread 상속받은 MyThread는 바로 start 시키면 됨.
//		MyThread t = new MyThread();
//		t.start();
		
		// Runnable 구현 MyThread는 start가 없음.. Thread 객체 만들어서
		// MyThread 객체를 주입해야 start가 가능함.
		Thread t = new Thread(new MyThread());
		t.start();
		
		for(int i=0; i<1000000; i++){
			System.out.println("main i:"+i);
		}
	}
}
