package test02;



public class Test {
	public static void main(String[] args) {
		Complex c1 = new Complex(3, 2);
		Complex c2 = new Complex(4, 5);
		
		Complex result = c1.add(c2);
		
		result.printComplex();
	}
}
