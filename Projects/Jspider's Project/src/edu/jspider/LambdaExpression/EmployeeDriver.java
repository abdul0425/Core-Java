package edu.jspider.LambdaExpression;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EmployeeDriver {

	public static void main(String[] args) {
			List<Employee> l=new ArrayList();
			l.add(new Employee("Arshad Alam", 55000, 2));
			l.add(new Employee("Rivu Naskar", 65000, 2));
			l.add(new Employee("Akhil Pandu", 50000, 1));
			l.add(new Employee("Keerthi Suresh", 65000, 3));
			l.add(new Employee("Sai Pallavi", 75000, 3));
			l.add(new Employee("Nayantara", 85000, 2));
			l.add(new Employee("Allu Arjun", 75000, 3));
			l.add(new Employee("Jr NTR", 95000, 2));
			
			/*  Predicate<Employee> p=new Predicate<Employee>()
					{
						@Override
						public boolean test(Employee e)
						{
							return e.empSalary>65000 && e.experience>2;
						}
					};
			for(Employee e:l)
			{
				if(p.test(e))
					System.out.println(e);
			}   */
		
			Predicate<Employee> p=(e)->{ return e.empSalary>65000 && e.experience>2; };
			for(Employee e:l)
			{
				if(p.test(e))
					System.out.println(e.empName+" : "+e.empSalary);
			}
	}
}
