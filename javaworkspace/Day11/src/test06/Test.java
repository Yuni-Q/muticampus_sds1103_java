package test06;

import java.awt.event.ActionListener;
import java.util.Arrays;

public class Test{
	public static void main(String[] args) {
		
//		 Student s1 = new Student("양유진", 20, 4.5);
//		 Student s2 = new Student("홍길동", 21, 4.0);
//		
//		 System.out.println(s1.compareTo(s2));
		//////////////////////////////////////////////////////////////
		Student[] students = new Student[4];

		students[0] = new Student("김자바", 20, 3.5);
		students[1] = new Student("양유진", 21, 3.7);
		students[2] = new Student("스프링", 20, 4.5);
		students[3] = new Student("홍길동", 21, 2.0);
		
		for(int i=0; i<students.length; i++)
			System.out.println(students[i].toString());
		
		Arrays.sort(students);
		
		System.out.println("-----------------------");
		for(int i=0; i<students.length; i++)
			System.out.println(students[i].toString());
	}
}
