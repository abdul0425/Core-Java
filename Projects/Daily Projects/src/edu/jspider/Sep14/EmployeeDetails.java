package edu.jspider.Sep14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class EmployeeDetails {

	public static void main(String[] args) {
		ArrayList<Employee> e = new ArrayList<Employee>();

		Comparator c = new CompareAge();
		Employee e1 = new Employee("AB101", "Arshad Alam", 50, "Male");
		Employee e2 = new Employee("AB201", "Keerthi Suresh", 29, "Female");
		Employee e3 = new Employee("AB301", "Rivu Naskar ", 55, "Male");
		Employee e4 = new Employee("AB401", "Sai Pallavi", 28, "Female");
		Employee e5 = new Employee("AB501", "Akhil Pandu", 45, "Male");

		e.add(e1);
		e.add(e2);
		e.add(e3);
		e.add(e4);
		e.add(e5);
		Collections.sort(e);

		System.out.println("Sorting Employee Name wise  : ");
		for (Employee a : e)
			System.out.println(a);
		System.out.println();
		
		Collections.sort(e, c);
		System.out.println("Sorting Employee Age wise  : ");
		for (Employee a : e)
			System.out.println(a);
	}

}
