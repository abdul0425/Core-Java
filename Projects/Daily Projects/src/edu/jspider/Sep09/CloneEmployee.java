package edu.jspider.Sep09;

public class CloneEmployee {

	public static void main(String[] args) throws CloneNotSupportedException {
		Employee e1=new Employee(101,"Arshad",60);
		Employee e2=e1.clone();
		
		System.out.println(e1.toString());
		System.out.println(e2.toString());
		
		System.out.println(e1==e2);
	}

}
