class Employee
{
	String empName;
	int empId;
	// So you can declare "Company" variable as "Static" for "Memory Efficient"
	//String company;
	static String company = " Jio ";
	
	//Employee(String empName, int empId, String company)
	
	Employee(String empName, int empId)
	{
		this.empName = empName;
		this.empId = empId;
		//this.company = company;
	}
	
	void m1()
	{
		System.out.println(empName+" "+empId+" "+company);
	}
}

class StaticKeyword
{
	public static void main(String[] args)
	{
		//Employee e1 = new Employee("Arshad" , 101 , "Jspider");
		Employee e1 = new Employee("Arshad" , 101);
		e1.m1();
		//Employee e2 = new Employee("Ameen" , 102 , "Jspider");
		Employee e2 = new Employee("Ameen" , 102);
		e2.m1();
		//Employee e3 = new Employee("Pawan" , 103 , "Jspider");
		Employee e3 = new Employee("Pawan" , 103);
		e3.m1();
		//Employee e4 = new Employee("Bala" , 104 , "Jspider");
		Employee e4 = new Employee("Bala" , 104);
		e4.m1();
	}
}