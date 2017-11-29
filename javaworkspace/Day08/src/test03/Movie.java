package test03;

public class Movie {
	//1. 영화 제목, 평점, 감독, 발표된 연도 필드를 선언하시오.
	private String title;
	private double score;
	private String director;
	private int year;
	
	//2. 각 필드에 대한 접근자와 설정자를 작성하시오.
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
	//3. 영화의 모든 정보를 화면에 출력하는(sysout) print 메소드를
	//   작성하시오. 
	//		ex) public void print(){ 
	// 				이부분 작성
	//			}
	public void print(){
		System.out.println("제목 : "+title);
		System.out.println("평점 : "+score);
		System.out.println("감독 : "+director);
		System.out.println("제작연도 : "+year);
	}
}
