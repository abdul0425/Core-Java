package edu.jspider.LambdaExpression;
import java.util.List;
import java.util.ArrayList;
import java.util.function.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class StudentDriver {

	public static void main(String[] args) {
		List<Student> l1=new ArrayList();
		Student s1=new Student("Arshad Alam", 101);
		Student s2=new Student("Rivu Naskar", 201);
		Student s3=new Student("Akhil Pandu", 301);
		Student s4=new Student("Keerthi Suresh", 401);
		Student s5=new Student("Sai Pallavi", 501);
		Student s6=new Student("Samantha Ruth Prabhu", 601);
		Student s7=new Student("Ram Charan", 701);
		Student s8=new Student("Jr NTR", 801);
		Student s9=new Student("Allu Arjun", 901);
		Student s10=new Student("Thalapaty Vijay", 1001);
		
		l1.add(s1);
		l1.add(s2);
		l1.add(s3);
		l1.add(s4);
		l1.add(s5);
		l1.add(s6);
		l1.add(s7);
		l1.add(s8);
		l1.add(s9);
		l1.add(s10);
		
		/*  Consumer<Student> c=new Consumer()
						{
							@Override
							public void accept(Student t)
							{
								System.out.println(t);
							}
						}; */
						
		Stream<Student> st=l1.stream();
		List<Object> l2=st.filter(e->e.studentName.startsWith("A")).collect(Collectors.toList());
		
		Consumer<Object> con=e->System.out.println(e);
		l2.forEach(con);
		
		//l2.forEach(e->System.out.println("Student Name  :  "+e));
	}
}
