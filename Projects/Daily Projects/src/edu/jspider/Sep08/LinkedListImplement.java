package edu.jspider.Sep08;

public class LinkedListImplement {

	
	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		
		ll.remove(2);
		for(int i=0;i<ll.size();i++)
			System.out.println(ll.get(i));
	}
}
