package test06;

import java.awt.event.ActionListener;
import java.util.Arrays;

public class Test{
	public static void main(String[] args) {
		
//		 Student s1 = new Student("������", 20, 4.5);
//		 Student s2 = new Student("ȫ�浿", 21, 4.0);
//		
//		 System.out.println(s1.compareTo(s2));
		//////////////////////////////////////////////////////////////
		Student[] students = new Student[4];

		students[0] = new Student("���ڹ�", 20, 3.5);
		students[1] = new Student("������", 21, 3.7);
		students[2] = new Student("������", 20, 4.5);
		students[3] = new Student("ȫ�浿", 21, 2.0);
		
		for(int i=0; i<students.length; i++)
			System.out.println(students[i].toString());
		
		Arrays.sort(students);
		
		System.out.println("-----------------------");
		for(int i=0; i<students.length; i++)
			System.out.println(students[i].toString());
	}
}
