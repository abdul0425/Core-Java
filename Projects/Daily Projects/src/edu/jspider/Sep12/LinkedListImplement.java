package edu.jspider.Sep12;

public class LinkedListImplement {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add("Arshad Alam");
		ll.add("Rivu Naskar");
		ll.add("Akhil Pandu");
		ll.add("Sk Ameen");
		ll.add("Pawan Reddy");
		
		for(int i=0;i<ll.size();i++)
		{
			String s=(String)ll.get(i);
			System.out.println(s);
		}
		System.out.println("------------");
		ll.add(2, "Balu Reddy");
		for(int i=0;i<ll.size();i++)
		{
			String s=(String)ll.get(i);
			System.out.println(s);
		}
		System.out.println("------------");
		
		ll.remove(0);
		for(int i=0;i<ll.size();i++)
		{
			String s=(String)ll.get(i);
			System.out.println(s);
		}
		System.out.println("------------");
		ll.remove(2);
		for(int i=0;i<ll.size();i++)
		{
			String s=(String)ll.get(i);
			System.out.println(s);
		}
		
		System.out.println("------------");
		
		ll.reverse();
		for(int i=0;i<ll.size();i++)
		{
			String s=(String)ll.get(i);
			System.out.println(s);
		}
	}

}
