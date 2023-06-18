package edu.jspider.FlatMap;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

class Student1
{
	String name;
	int id;
	
	Student1(String n,int id)
	{
		name=n;
		this.id=id;
	}

	@Override
	public String toString() {
		return "Student1 [name=" + name + ", id=" + id + "]";
	}
	
}

public class FlatMapDemo3 {

	public static void main(String[] args) {
		Student1 s1=new Student1("Arshad",101);
		Student1 s2=new Student1("Rivu",201);
		Student1 s3=new Student1("Akhil",301);
		Student1 s4=new Student1("Arsalan",401);
		
		List<Student1> l=List.of(s1,s2,s3,s4);
		
		Function<Student1,Student1> f=new Function<>()
				{
					public Student1 apply(Student1 t)
					{
						t.name=t.name.toUpperCase();
						return t;
					}
				};
				
		List<Student1> l2=l.stream().map(f).collect(Collectors.toList());
		
		l2.forEach(name->System.out.println(name));
	}

}
