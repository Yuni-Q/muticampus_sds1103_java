package test02;

public class Test {
	public static void main(String[] args) {
		Car myCar = new Car();

		// ������� speed�� private �̹Ƿ�
		// ��ü �ܺο��� ���������� �̿��� ������ �Ұ��� ��.
		// myCar.speed = 100;
		
//		myCar.color = "RED";
		myCar.setColor("RED");
		
//		System.out.println("���� myCar�� ���� : "+ myCar.color);
		System.out.println("���� myCar�� ���� : "+ myCar.getColor());
		
		myCar.speedUp();
	}
}
