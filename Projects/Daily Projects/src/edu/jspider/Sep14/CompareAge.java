package edu.jspider.Sep14;

import java.util.Collections;
import java.util.Comparator;

public class CompareAge implements Comparator<Employee> {

	@Override
	public int compare(Employee o1, Employee o2) {
		if (o1.empAge > o2.empAge)
			return 1;
		if (o1.empAge < o2.empAge)
			return -1;
		return 0;
	}

}
