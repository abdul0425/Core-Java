package edu.jspider.July15;

public class LinkedListImplement {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("Arshad Alam");
		l.add("Rivu Naskar");
		l.add("Akhil Pandu");
		l.add("Joeson Sir");
		l.add("Raveesh Kumar");
		
		l.add(2, "Kishore Reddy");
		l.remove(3);
		
		for(int i=0;i<l.size();i++)
		{
			String s=(String)l.get(i);
			System.out.println(s);
		}
		
		l.reverse();
		System.out.println("===================");
		for(int i=0;i<l.size();i++)
		{
			String s=(String)l.get(i);
			System.out.println(s);
		}
	}
	
}
