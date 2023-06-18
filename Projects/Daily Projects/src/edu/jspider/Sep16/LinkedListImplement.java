package edu.jspider.Sep16;

public class LinkedListImplement {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add("Arshad Alam");
		ll.add("Keerthi Suresh");
		ll.add("Sai Pallavi");
		ll.add("Akhil Pandu");
		ll.add("Rivu Naskar");
		
		for(int i=0;i<ll.size();i++)
		{
			String name=(String)ll.get(i);
			System.out.println("Employee Names  :  "+name);
		}
	}
}
