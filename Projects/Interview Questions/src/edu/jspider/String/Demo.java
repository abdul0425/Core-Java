package edu.jspider.String;
import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.List;

class Employee
{
	String ename;
	int salary;
	public Employee(String ename, int salary) {
		this.ename = ename;
		this.salary = salary;
	}
	
}



public class Demo {

	public static void main(String[] args) {
		List<Employee> l=new ArrayList();
		Employee e1=new Employee("Rivu",5000);
		Employee e2=new Employee("Anjani",8000);
		Employee e3=new Employee("Arshad",4000);
		Employee e4=new Employee("Akhil",5000);
		Employee e5=new Employee("Rohan",6000);
		l.add(e1);
		l.add(e2);
		l.add(e3);
		l.add(e4);
		l.add(e5);
		
		Predicate<Employee> p=s->s.salary>=6000;
		
		
		for(Employee e:l)
		{
			if(p.test(e))
				System.out.println("Name  :  "+e.ename+" Salary : "+e.salary);
				
//			if(e.salary>=6000)
//			{
//				System.out.println("Name : "+e.ename);
//			}
		}
	}

}
