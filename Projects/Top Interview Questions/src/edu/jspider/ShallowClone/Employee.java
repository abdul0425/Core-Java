package edu.jspider.ShallowClone;

public class Employee implements Cloneable{

	String name;
	int id;
	String mobile;
	Address a;
	public Employee(String name, int id, String mobile, Address a) {
		this.name = name;
		this.id = id;
		this.mobile = mobile;
		this.a = a;
	}
	@Override
	public String toString() {
		return "Employee [name=" + name + ", id=" + id + ", mobile=" + mobile + ", a=" + a + "]";
	}
	@Override
	protected Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
}
