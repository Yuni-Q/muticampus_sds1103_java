package test06;

public class Car {
	private int startCount;
	
	public Car(int startCount){
		this.startCount = startCount;
	}
//////////////////////////////////////////////////////	
	public void start(){
		System.out.println(startCount+"초 후에 차가 출발합니다.");
		
		for(int i=startCount; i>0; i--){
			System.out.println("카운트다운 " + i);
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		
		System.out.println("출~발~!!");
	}
}
