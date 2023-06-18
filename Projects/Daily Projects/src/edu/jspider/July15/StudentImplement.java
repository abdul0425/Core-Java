package edu.jspider.July15;
import java.util.Comparator;
import java.util.Collections;
import java.util.ArrayList;
public class StudentImplement {

	static void pattern()
	{
		System.out.println("================================================");
	}
	
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		Student s1=new Student("Arshad Alam", 601, "Male", 55);
		Student s2=new Student("Ram Charan", 201, "Male", 38);
		Student s3=new Student("Mahesh Babu", 301, "Male", 45);
		Student s4=new Student("Jr NTR", 101, "Male", 35);
		Student s5=new Student("Prabhas", 401, "Male", 37);
		Student s6=new Student("Thalapaty Vijay", 901, "Male", 43);
		
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		al.add(s5);
		al.add(s6);
		pattern();
		Collections.sort(al);
		System.out.println("Sorte By Name  :  ");
		for(Object o:al)
			System.out.println(o);
		pattern();
		
		Comparator c=new Comparator()
				{
					@Override
					public int compare(Object o1,Object o2)
					{
						Student s1=(Student)o1;
						Student s2=(Student)o2;
						
						if(s1.studentId>s2.studentId)return 1;
						if(s1.studentId<s2.studentId)return -1;
						return 0;
					}
				};
				
			pattern();
			Collections.sort(al, c);
			System.out.println("Sorte By Id  :  ");
			for(Object o:al)
				System.out.println(o);
			pattern();
		c=(o1,o2)->
		{
			//if(s1.studentAge>s2.studentAge)return 1;
			//if(s1.studentAge<s2.studentAge)return -1;
			return s1.studentAge-s2.studentAge;
		};
		Collections.sort(al, c);
		pattern();
		System.out.println("Sorte By Age  :  ");
		for(Object o:al)
			System.out.println(o);
		pattern();
	}
}
