package test01;

public class Test {
	public static void main(String[] args) {
		Shape s = new Rectangle(0, 0, 10, 20);
		
		System.out.println("����:"+s.calcArea());
		
		s = new Circle(0, 0, 5);
		System.out.println("����:"+s.calcArea());
		System.out.println("������:"+ ((Circle)s).getRadius() );
	}
}
