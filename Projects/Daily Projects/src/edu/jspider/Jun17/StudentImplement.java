package edu.jspider.Jun17;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.ArrayList;

public class StudentImplement {

	public static void main(String[] args) {
		List<Student> l=new ArrayList<Student>();
		Student s1=new Student("Arshad Alam", 101, 55);
		Student s2=new Student("Rivu Naskar", 201, 53);
		Student s3=new Student("Akhil Pandu", 301, 50);
		Student s4=new Student("Keerthi Suresh", 401, 32);
		Student s5=new Student("Sai Pallavi", 501, 30);
		Student s6=new Student("Allu Arjun", 601, 42);
		Student s7=new Student("Ram Charan", 701, 35);
		Student s8=new Student("Jr NTR", 801, 38);
		Student s9=new Student("Ravi Teja", 901, 40);
		Student s10=new Student("Nayantara", 1001, 35);
		
		l.add(s1);
		l.add(s2);
		l.add(s3);
		l.add(s4);
		l.add(s5);
		l.add(s6);
		l.add(s7);
		l.add(s8);
		l.add(s9);
		l.add(s10);
		
		// Annonymous Class.
//		Function<Student,Student> f=new Function<Student,Student>(){
//
//			@Override
//			public Student apply(Student t) {
//				t.studentName=t.studentName.toUpperCase();
//				return t;
//			}
//			
//		};
		
		// Using Lambda Expression.
		Function<Student,Student> f=s->{
			s.studentName=s.studentName.toUpperCase();
			return s;
		};
		
		List<Student> l2=l.stream().map(f).collect(Collectors.toList());
		l2.forEach(e->System.out.println("Student Name  :  "+e));
	}
}
