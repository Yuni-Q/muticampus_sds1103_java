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
		// �θ��� private ����� ���� �Ұ���
		// ���°� �ƴ�! �ִµ� ���ٸ� �ȵ�.
//		System.out.println("�ӵ�:"+speed);
//		System.out.println("�ӵ�:"+super.speed);
		System.out.println("�ӵ�:"+getSpeed());
		
		// �θ� protected �س��� ��� �ڽ�Ŭ�������� ���� ����
		System.out.println("������:"+model);
		System.out.println("�ͺ����:"+turbo);
	}
}
