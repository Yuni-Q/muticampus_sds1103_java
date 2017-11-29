package test;

class MyClass {
	String s;
	int x = 12;
	public void method(int x){
		x += x;
		System.out.println(x);
	}
}


public class Test {
	public static void main(String[] args) {
		System.out.print(10+"10"+20+","+30);
	}
	
	public static Long add(int i){
		
		return new Long(i);
	}
}
