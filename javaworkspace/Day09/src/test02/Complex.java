package test02;

public class Complex {
	private int real; // 실수부
	private int imag; // 허수부
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
// 다른 객체의 주소를 받아서 해당 객체와 실수,허수 덧셈 수행
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



