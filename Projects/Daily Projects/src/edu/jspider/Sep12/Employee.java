package edu.jspider.Sep12;

public class Employee {
	String name;
	int id;
	int x=1;
	
	Employee(String name)
	{
		this.name=name;
		id=x++;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + "]";
	}
	
	
	
}
