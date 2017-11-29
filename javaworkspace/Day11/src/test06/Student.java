package test06;

public class Student implements Comparable<Student> {
	private String name; // 이름
	private int age; // 나이
	private double grade; // 학점
	///////////////////////////////////////////////////////////////

	public Student(String name, int age, double grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "이름:" + name + ",나이:" + age + ",학점:" + grade;
	}

	@Override
	public int compareTo(Student other) {
		if (this.grade > other.grade) {
			// 현재 객체의 학점이 더 높은 경우
			return 1;
		} else if (this.grade < other.grade) {
			// 전달받은 다른 학생객체의 학점이 더 높은 경우
			return -1;
		} else {
			// 현재 객체와 전달받은 다른 학생객체의 점수가 같은 경우
			return 0;
		}
	}
}
