package edu.jspider.FlatMap;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.function.*;
public class Student {

	String name;
	int id;
	public Student(String name, int id) {
		this.name = name;
		this.id = id;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + "]";
	}
	
	public static void main(String[] args) {
		List<Student> l1=List.of(new Student("Arshad",101));
//		l1.add(new Student("Arshad",101));
		
		Function<Student,Student> f=new Function<>()
				{

					@Override
					public Student apply(Student t) {
						t.name=t.name.toUpperCase();
						return t;
					}
					
				};
		
		List<Student> l2=l1.stream().flatMap(f)
				.collect(Collectors.toList());
		System.out.println(l2);
	}
	
}
