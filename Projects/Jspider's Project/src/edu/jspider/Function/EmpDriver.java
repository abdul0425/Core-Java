package edu.jspider.Function;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class EmpDriver {

	public static void main(String[] args) {
		List<Employee> l=new ArrayList();
		
				Employee s1=new Employee("Arshad Alam", 101, 55000);
				Employee s2=new Employee("Rivu Naskar", 201, 53000);
				Employee s3=new Employee("Akhil Pandu", 301, 50000);
				Employee s4=new Employee("Keerthi Suresh", 401, 72000);
				Employee s5=new Employee("Sai Pallavi", 501, 75000);
				Employee s6=new Employee("Allu Arjun", 601, 142000);
				Employee s7=new Employee("Ram Charan", 701, 135000);
				Employee s8=new Employee("Jr NTR", 801, 138000);
				Employee s9=new Employee("Ravi Teja", 901, 84000);
				Employee s10=new Employee("Nayantara", 1001, 135000);
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
				
				Function<Employee,Integer> f=e->
				{
					int sal=e.salary;
					if(sal>=30000 && sal<=40000)return sal*10/100;
					else if(sal>=40000 && sal<=50000)return sal*20/100;
					else if(sal>=50000 && sal<=60000)return sal*30/100;
					else return sal*40/100;
				};
				
			for(Employee e:l)
			{
				int bonus=f.apply(e);
				if(bonus>20000)
					System.out.println("Name   :   "+e.empName+"  Bonus  :  "+bonus);
			}
	}
}
