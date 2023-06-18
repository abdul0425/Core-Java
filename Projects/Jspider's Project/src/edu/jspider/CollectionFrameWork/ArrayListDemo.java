package edu.jspider.CollectionFrameWork;

public class ArrayListDemo {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(" Core Java");
		al.add(" Advance Java");
		al.add(" Spring");
		al.add(" Spring Boot");
		al.add(" Hibernet");
		
		
		
		//Printing ArrayList Element's.
		for(int i=0;i<al.size();i++)
			System.out.println(al.get(i));
		System.out.println("888888888888888");
		al.add(0, " Jdbc");
		for(int i=0;i<al.size();i++)
			System.out.println(al.get(i));
			
	}

}
