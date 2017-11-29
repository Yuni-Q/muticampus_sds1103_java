package test02;

public class SportsCar extends Car{
	private boolean turbo = true;
////////////////////////////////////////////////	
	public void setTurbo(boolean turbo) {
		this.turbo = turbo;
	}
	public boolean getTurbo(){
		return turbo;
	}
//////////////////////////////////////////////////	
	public void printInfo(){
		// 부모의 private 멤버는 접근 불가능
		// 없는건 아님! 있는데 접근만 안됨.
//		System.out.println("속도:"+speed);
//		System.out.println("속도:"+super.speed);
		System.out.println("속도:"+getSpeed());
		
		// 부모가 protected 해놓은 경우 자식클래스에서 접근 가능
		System.out.println("모델정보:"+model);
		System.out.println("터보모드:"+turbo);
	}
}
