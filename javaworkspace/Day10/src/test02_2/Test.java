package test02_2;

import test02.SportsCar;

public class Test {
	public static void main(String[] args) {
		SportsCar c = new SportsCar();
		// Car Ŭ�������� protected �����ؼ� �ڽ�Ŭ������
		// SportsCar�� model�� ������ ����������
		// ��ü �ܺ� ���������� �̿��� model ������ �Ұ�����.
//		c.model = "Audi";
		c.setModel("Audi");
	}
}
