package test04;

public class Test {
	public static void main(String[] args) {
		String s = new String("Hello Java");
		
		String result = s.toUpperCase();
		System.out.println(result);
		
		result = s.substring(1);
		System.out.println(result);
		
		result = s.substring(1, 3);
		System.out.println(result);
		
		System.out.println(s.charAt(6));
		System.out.println(s.length());
		System.out.println(s.indexOf('a'));
		System.out.println(s.equals("Hello java"));
		System.out.println(s.equalsIgnoreCase("Hello java"));
		System.out.println(s.replace("Java", "JSP"));
		System.out.println(s);
	}
}
