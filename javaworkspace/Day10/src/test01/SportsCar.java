package test01;

public class SportsCar extends Car{
	public boolean turbo;
	
	public SportsCar(){
//		speed = 0;
//		color = "WHITE";
//		model = "SONATA";
		super(); // �θ�Ŭ���� Car�� �⺻������ ȣ��
		turbo = true;
	}
	public SportsCar(int speed, String color, String model, boolean turbo){
		super(speed,color,model); // �θ�Ŭ������ int,String,String ������ ȣ��
		this.turbo = turbo;
	}
	
	public void printInfo(){
//		System.out.println("����ӵ�:"+speed);
//		System.out.println("����:"+color);
//		System.out.println("�𵨸�:"+model);
		super.printInfo();
		System.out.println("�ͺ����:"+turbo);
	}	
}
