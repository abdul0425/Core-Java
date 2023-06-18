package edu.jspider.Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class EmpDriver {

	public static void main(String[] args) {
		List<Employee> l=new ArrayList<>();
		Employee e1=new Employee("Arshad Alam", 101, 55000);
		Employee e2=new Employee("Rivu Naskar", 201, 53000);
		Employee e3=new Employee("Akhil Pandu", 301, 50000);
		Employee e4=new Employee("Keerthi Suresh", 401, 72000);
		Employee e5=new Employee("Sai Pallavi", 501, 75000);
		Employee e6=new Employee("Allu Arjun", 601, 142000);
		Employee e7=new Employee("Ram Charan", 701, 135000);
		Employee e8=new Employee("Jr NTR", 801, 138000);
		Employee e9=new Employee("Ravi Teja", 901, 84000);
		Employee e10=new Employee("Nayantara", 1001, 135000);
		
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		l.add(e5);
		l.add(e6);
		l.add(e7);
		l.add(e8);
		l.add(e9);
		l.add(e10);
		
		// --->Compare Based on Name :
		System.out.println("Compare Based on Name  : ");
		Comparator<Employee> c=(val1,val2)->(val1.name.compareTo(val2.name));
		
		Collections.sort(l, c);
		
		for(Employee e:l)
			System.out.println("Name : "+e.name+" , Salary : "+e.salary);
		System.out.println("===============================================");
		//  ==> Compare based on Salary :
		
		c=(v1,v2)->v1.salary>v2.salary?-1:(v2.salary>v1.salary?1:0);
		
		Collections.sort(l, c);
		System.out.println("Compare Based on Salary  : ");
		for(Employee n:l)
			System.out.println("Name : "+n.name+" , Salary : "+n.salary);
		System.out.println("===============================================");
	}
}
