package test04;

public class SportsCar extends Car{
	private boolean turbo;
	
	public SportsCar(int speed, String color, String model, boolean turbo){
		super(speed,color,model);
		this.turbo = turbo;
	}

	@Override
	public void printInfo(){
		// �ڽ� �������� ������(overriding)
		// �θ���� printInfo����� �ʿ��ϸ� super.���� �����ϸ� ������
		// �ʼ��� �ƴ�.
		super.printInfo();
		System.out.println("�ͺ����:"+turbo);		
	}

}
