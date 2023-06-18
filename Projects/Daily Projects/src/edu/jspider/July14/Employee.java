package edu.jspider.July14;

public class Employee implements Cloneable {

	String empName;
	String empId;
	String mobNo;
	Address add;

	public Employee(String empName, String empId, String mobNo, Address add) {
		this.empName = empName;
		this.empId = empId;
		this.mobNo = mobNo;
		this.add = add;
	}

	@Override
	public String toString() {
		return "Employee [empName=" + empName + ", empId=" + empId + ", mobNo=" + mobNo + ", add=" + add + "]";
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		Employee e = (Employee) super.clone();
		e.add = (Address) add.clone();
		return e;
	}

}
