package edu.jspider.Predicate;
import java.util.List;
import java.util.ArrayList;
import java.util.function.Predicate;
import java.util.function.Function;
import java.util.function.Consumer;

class Employee
{
	String empName;
	int empSalary;
	String gender;
	public Employee(String empName, int empSalary, String gender) {
		this.empName = empName;
		this.empSalary = empSalary;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empSalary=" + empSalary + ", gender=" + gender + "]";
	}
	
}



public class EmpDriver {

	public static void main(String[] args) {
		List<Employee> l=new ArrayList();
		l.add(new Employee("Arshad Alam", 65000, "Male"));
		l.add(new Employee("Rivu Naskar", 35000, "Male"));
		l.add(new Employee("Akhil Pandu", 32000, "Male"));
		l.add(new Employee("Keerthi Suresh", 60000, "Female"));
		l.add(new Employee("Sai Pallavi", 75000, "Female"));
		l.add(new Employee("Samantha Ruth Prabhu", 85000, "Female"));
		l.add(new Employee("Nayanthara", 90000, "Female"));
		
		// Using Predicate Exp For Conditional check :
		Predicate<Employee> p=s->s.empSalary>50000;
		
		for(Employee e:l)
		{
			if(p.test(e))
				System.out.println("Employee  : "+e.empName+"  Salary  :  "+e.empSalary);
		}
	}

}
