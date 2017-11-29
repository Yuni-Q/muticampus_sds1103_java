package test04;

public class SportsCar extends Car{
	private boolean turbo;
	
	public SportsCar(int speed, String color, String model, boolean turbo){
		super(speed,color,model);
		this.turbo = turbo;
	}

	@Override
	public void printInfo(){
		// 자식 버전으로 재정의(overriding)
		// 부모버전 printInfo기능이 필요하면 super.으로 실행하면 되지만
		// 필수는 아님.
		super.printInfo();
		System.out.println("터보모드:"+turbo);		
	}

}
