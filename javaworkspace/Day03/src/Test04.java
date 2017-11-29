







public class Test04 {
	public static void main(String[] args) {
		int a = 50, b, c, d, e, f;
		
		b = ++a + 30;
		c = --b + ++a;
		d = a * ++c;
		e = ++d;
		f = a++ + d;
		
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
	}
}





