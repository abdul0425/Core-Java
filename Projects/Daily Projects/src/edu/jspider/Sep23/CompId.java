package edu.jspider.Sep23;

import java.util.Comparator;

public class CompId implements Comparator{

	@Override
	public int compare(Object o1,Object o2)
	{
		Student s1=(Student)o1;
		Student s2=(Student)o2;
		if(s1.studentId>s2.studentId)return 1;
		if(s1.studentId<s2.studentId)return -1;
		return 0;
		
	}
}
