package edu.jspider.SetInteger;

public class SetImplement {

	public static void main(String[] args) {
		Set s=new Set();
		System.out.println(s.add(10));
		System.out.println(s.add(20));
		System.out.println(s.add(30));
		System.out.println(s.add(40));
		System.out.println(s.add(10));
		System.out.println(s.add(20));
		
		System.out.println("SIze  :  "+s.size());
		
		s.display();
	}
}
