package test03;

public class Movie {
	//1. ��ȭ ����, ����, ����, ��ǥ�� ���� �ʵ带 �����Ͻÿ�.
	private String title;
	private double score;
	private String director;
	private int year;
	
	//2. �� �ʵ忡 ���� �����ڿ� �����ڸ� �ۼ��Ͻÿ�.
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public double getScore() {
		return score;
	}
	public void setScore(double score) {
		this.score = score;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	//3. ��ȭ�� ��� ������ ȭ�鿡 ����ϴ�(sysout) print �޼ҵ带
	//   �ۼ��Ͻÿ�. 
	//		ex) public void print(){ 
	// 				�̺κ� �ۼ�
	//			}
	public void print(){
		System.out.println("���� : "+title);
		System.out.println("���� : "+score);
		System.out.println("���� : "+director);
		System.out.println("���ۿ��� : "+year);
	}
}
