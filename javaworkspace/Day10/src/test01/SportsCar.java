package test01;

public class SportsCar extends Car{
	public boolean turbo;
	
	public SportsCar(){
//		speed = 0;
//		color = "WHITE";
//		model = "SONATA";
		super(); // 부모클래스 Car의 기본생성자 호출
		turbo = true;
	}
	public SportsCar(int speed, String color, String model, boolean turbo){
		super(speed,color,model); // 부모클래스의 int,String,String 생성자 호출
		this.turbo = turbo;
	}
	
	public void printInfo(){
//		System.out.println("현재속도:"+speed);
//		System.out.println("색상:"+color);
//		System.out.println("모델명:"+model);
		super.printInfo();
		System.out.println("터보모드:"+turbo);
	}	
}
