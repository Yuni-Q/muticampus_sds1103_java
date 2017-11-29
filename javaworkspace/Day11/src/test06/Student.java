package test06;

public class Student implements Comparable<Student> {
	private String name; // �̸�
	private int age; // ����
	private double grade; // ����
	///////////////////////////////////////////////////////////////

	public Student(String name, int age, double grade) {
		this.name = name;
		this.age = age;
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "�̸�:" + name + ",����:" + age + ",����:" + grade;
	}

	@Override
	public int compareTo(Student other) {
		if (this.grade > other.grade) {
			// ���� ��ü�� ������ �� ���� ���
			return 1;
		} else if (this.grade < other.grade) {
			// ���޹��� �ٸ� �л���ü�� ������ �� ���� ���
			return -1;
		} else {
			// ���� ��ü�� ���޹��� �ٸ� �л���ü�� ������ ���� ���
			return 0;
		}
	}
}
