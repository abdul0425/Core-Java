package edu.jspider.SetObject;

public class SetImplement {

	public static void main(String[] args) {
		Set s=new Set();
		System.out.println(s.add("Arshad"));
		System.out.println(s.add("Noorii"));
		System.out.println(s.add("Mehmed"));
		System.out.println(s.add("Raja"));
		System.out.println(s.add("Arshad"));
		System.out.println(s.add("Mehmed"));
		
		s.display();
	}
}
