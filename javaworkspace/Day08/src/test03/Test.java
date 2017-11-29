package test03;

public class Test {
	public static void main(String[] args) {
		Movie m1 = new Movie();
		
		m1.setTitle("생갈치1호의 행방불명");
		m1.setScore(9.5);
		m1.setDirector("미야자키 하야오");
		m1.setYear(2000);
		
		m1.print();
	}
}
