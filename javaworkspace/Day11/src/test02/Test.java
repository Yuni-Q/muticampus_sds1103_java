package test02;

public class Test {
	public static void main(String[] args) {		
		System.out.println("����:"+ calcArea(new Rectangle(0, 0, 10, 20)));
		System.out.println("����:"+ calcArea(new Circle(0, 0, 10)));
	}
	
	public static double calcArea(Shape s){
		if(s instanceof Circle){
			return 
			((Circle) s).getRadius()*((Circle) s).getRadius()*3.14;
		}else if(s instanceof Rectangle){
			return 
			((Rectangle) s).getWidth()*((Rectangle) s).getHeight();
		}else{
			System.out.println("�߸��� ����! ���� ��� �Ұ�!");
			return 0;
		}		
	}
}
