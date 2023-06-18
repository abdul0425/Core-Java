package edu.jspider.Sep15;

public class LinkedListImplement {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add("Arshad Alam");
		ll.add("Rivu Naskar");
		ll.add("Akhil Pandu");
		ll.add("keerthi Suresh");
		ll.add("Sai Pallavi");
		
		for(int i=0;i<ll.size();i++)
		{
			String name=(String)ll.get(i);
			System.out.println(name);
		}
		
		
	}

}
