package test02;

public class Complex {
	private int real; // �Ǽ���
	private int imag; // �����
///////////////////////////////////////////////////////
	public Complex(int r, int i){
		real = r;
		imag = i;
	}
///////////////////////////////////////////////////////	
	public int getReal() {
		return real;
	}
	public void setReal(int real) {
		this.real = real;
	}
	public int getImag() {
		return imag;
	}
	public void setImag(int imag) {
		this.imag = imag;
	}
////////////////////////////////////////////////////////
// �ٸ� ��ü�� �ּҸ� �޾Ƽ� �ش� ��ü�� �Ǽ�,��� ���� ����
	public Complex add(Complex other){
		int resultReal = this.real + other.real;
		int resultImag = this.imag + other.imag;
		Complex result = new Complex(resultReal, resultImag);
		return result;		
	}
	
	public void printComplex(){
		System.out.println(real+ "+" +imag+ "i");
	}
}



