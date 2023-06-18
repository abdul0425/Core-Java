package edu.jspider.Sep10;

import java.util.Arrays;

public class StudentDetails {

	public static void main(String[] args) {
		Student[] a=new Student[5];
		a[0]=new Student(101, "Arshad", 22);
		a[1]=new Student(201, "Rivu", 25);
		a[2]=new Student(301, "Akhil", 20);
		a[3]=new Student(401, "Balu", 21);
		a[4]=new Student(501, "Pawan", 19);
		
		Arrays.sort(a);
		
		for(Student s:a)
			System.out.println(s);
	}

}
