package test06;

public class Car {
	private int startCount;
	
	public Car(int startCount){
		this.startCount = startCount;
	}
//////////////////////////////////////////////////////	
	public void start(){
		System.out.println(startCount+"�� �Ŀ� ���� ����մϴ�.");
		
		for(int i=startCount; i>0; i--){
			System.out.println("ī��Ʈ�ٿ� " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("��~��~!!");
	}
}
