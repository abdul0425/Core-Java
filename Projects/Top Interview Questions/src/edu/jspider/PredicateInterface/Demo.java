package edu.jspider.PredicateInterface;
import java.util.function.Predicate;
import java.util.ArrayList;
import java.util.List;

class Employee
{
	String name;
	int salary;
	String gender;
	public Employee(String name, int salary, String gender) {
		this.name = name;
		this.salary = salary;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + ", gender=" + gender + "]";
	}
	
}

public class Demo {

	public static void main(String[] args) {
		List<Employee> l=new ArrayList();
		l.add(new Employee("Arshad Alam", 65000, "Male"));
		l.add(new Employee("Rivu Naskar", 35000, "Male"));
		l.add(new Employee("Akhil Pandu", 32000, "Male"));
		l.add(new Employee("Keerthi Suresh", 60000, "Female"));
		l.add(new Employee("Sai Pallavi", 75000, "Female"));
		l.add(new Employee("Samantha Ruth Prabhu", 85000, "Female"));
		l.add(new Employee("Nayanthara", 90000, "Female"));
		
		Predicate<Employee> p=sal->sal.salary>=60000;
		for(Employee e:l)
		{
			if(p.test(e))
				System.out.println("Name : "+e.name+" , Salary : "+e.salary);
		}
	}
}
