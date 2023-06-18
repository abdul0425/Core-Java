package edu.jspider.July13;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Comparator;
public class StudentImplement {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		Student s1=new Student("Mehmed Arsalan", 301, 1,"Male" );
		Student s2=new Student("Noori Khatoon", 201, 26,"Female" );
		Student s3=new Student("Arshad Alam", 101, 30,"Male" );
		l.add(s1);
		l.add(s2);
		l.add(s3);
		Collections.sort(l);
		System.out.println("Compare Based on Name  :  ");
		for(Object o:l)
			System.out.println(o);
		
		Comparator c=new Comparator()
				{
					@Override
					public int compare(Object o1,Object o2)
					{
						Student s1=(Student)o1;
						Student s2=(Student)o2;
						
						if(s1.studentAge>s2.studentAge)return 1;
						if(s1.studentAge<s2.studentAge)return -1;
						return 0;
					}
				};
		Collections.sort(l, c);
		
		System.out.println("Compare Based on Age  :  ");
		for(Object o:l)
			System.out.println(o);
		
//		c=new Comparator()
//		{
//			@Override
//			public int compare(Object o1,Object o2)
//			{
//				Student s1=(Student)o1;
//				Student s2=(Student)o2;
//				if(s1.studentId>s2.studentId)return 1;
//				if(s1.studentId<s2.studentId)return -1;
//				return 0;
//			}
//		};
//		
		
		Comparator<Student> d=(o1,o2)->(o1.studentId>o2.studentId)?1:(o1.studentId<o2.studentId)?-1:0;
		
		Collections.sort(l,d);
		System.out.println("Compare Based on Id  :  ");
		for(Object o:l)
			System.out.println(o);
	}
}
