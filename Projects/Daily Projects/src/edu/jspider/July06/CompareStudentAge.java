package edu.jspider.July06;
import java.util.Comparator;
public class CompareStudentAge implements Comparator{

	public int compare(Object o1,Object o2)
	{
		Student s1=(Student)o1;
		Student s2=(Student)o2;
		if(s1.studentAge>s2.studentAge)return 1;
		if(s1.studentAge<s2.studentAge)return -1;
		return 0;
	}
}
