package edu.jspider.Sep28;

public class LinkedListImplement {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add("Jr NTR");
		ll.add("Mahesh Babu");
		ll.add("Allu Arjun");
		ll.add("Ram Charan");
		ll.add("Vijay Thalapaty");
		
		ll.add(2, "Prabhas");
		ll.remove(5);
		
		for(int i=0;i<ll.size();i++)
		{
			String name=(String)ll.get(i);
			System.out.println("Actor's Name   :   "+name);
	}
}
}
