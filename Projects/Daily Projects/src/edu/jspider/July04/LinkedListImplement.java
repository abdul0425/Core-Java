package edu.jspider.July04;

public class LinkedListImplement {

	public static void main(String[] args) {
		LinkedList list=new LinkedList();
		list.add("1. Core Java");
		list.add("2. Advance Java");
		list.add("3. Hibernate");
		list.add("4. Spring");
		list.add("5. Spring Boot");
		
		list.add(2, "2. Python");
		list.remove(5);
		
		for(int i=0;i<list.size();i++)
		{
			String course=(String)list.get(i);
			System.out.println(course);
		}
		
		System.out.println("=================");
		System.out.println("Reverse Order  :   ");
		System.out.println("=================");
		list.reverse();
		for(int i=0;i<list.size();i++)
		{
			String course=(String)list.get(i);
			System.out.println(course);
		}
		System.out.println("=================");
	}

}
