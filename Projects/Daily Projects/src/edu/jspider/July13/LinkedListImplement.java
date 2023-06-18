package edu.jspider.July13;

public class LinkedListImplement {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("Prabhas");
		l.add("Allu Arjun");
		l.add("Ravi Teja");
		l.add("Suriya");
		l.add("Arun Vijay");
		l.add("Ram Charan");
		
		l.add(3, "Jr NTR");
		
		l.remove(6);
		
		for(int i=0;i<l.size();i++)
		{
			String name=(String)l.get(i);
			System.out.println("Actor's   :   "+name);
		}
		
		l.reverse();
		System.out.println("Reverse Order  :  ");
		for(int i=0;i<l.size();i++)
		{
			String name=(String)l.get(i);
			System.out.println("Actor's   :   "+name);
		}
	}
}
