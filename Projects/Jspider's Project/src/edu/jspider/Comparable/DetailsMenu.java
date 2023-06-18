package edu.jspider.Comparable;

import java.util.ArrayList;
import java.util.Scanner;

public class DetailsMenu {

	public static void main(String[] args) {
		ArrayList al = new ArrayList();

		Student s1 = new Student(1, "Arshad Alam", 55, "Male");
		Student s2 = new Student(2, "Keerthi Suresh", 29, "Female");
		Student s3 = new Student(3, "Rivu Naskar", 52, "Male");
		Student s4 = new Student(4, "Sai Pallavi", 28, "Female");
		Student s5 = new Student(5, "Akhil Pandu", 53, "Male");
		Student s6 = new Student(6, "Nayantara", 30, "Feale");
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		al.add(s6);

		Scanner sc = new Scanner(System.in);
		System.out.println("Student Details  :  Total 6 Students Available.");
		System.out.println("Give id to find detail's...");
		int choice = sc.nextInt();

		switch (choice) {
		case 1:
			System.out.println(s1);
			break;
		case 2:
			System.out.println(s2);
			break;
		case 3:
			System.out.println(s3);
			break;
		case 4:
			System.out.println(s4);
			break;
		case 5:
			System.out.println(s5);
			break;
		case 6:
			System.out.println(s6);
			break;

		default:
			System.out.println("Invalid Input.");
		}

	}

}
