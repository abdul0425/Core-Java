package edu.jspider.July16;
import java.util.Collections;
import java.util.stream.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Comparator;
public class StudentImplement {

	public static void main(String[] args) {
		List<Student> l=new ArrayList<Student>();
		Student s1=new Student("Arshad Alam", 55, 101);
		Student s2=new Student("Rivu Naskar", 45, 201);
		Student s3=new Student("Akhil Pandu", 52, 301);
		Student s4=new Student("Keerthi Suresh", 31, 401);
		Student s5=new Student("Sai Pallavi", 30, 501);
		Student s6=new Student("Pooja Hegde", 29, 601);
		
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		l.add(s5);
		l.add(s6);
		
		List<Student> name=l.stream().sorted((o1,o2)->((o1.studentAge>o2.studentAge)?1:(o1.studentAge<o2.studentAge)?-1:0)).collect(Collectors.toList());
		
		System.out.println("Compare Based On Age :  ");
		for(Student n:name)
			System.out.println(n.studentName);
	}
}
