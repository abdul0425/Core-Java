package edu.jspider.Sep05;

public class ListImplements {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add(10);
		ll.add(20);
		ll.add(30);
		ll.add(40);
		ll.add(50);
		
		ll.add(3, 60);
		for(int i=0;i<ll.size();i++)
		{
			int item=(Integer)ll.get(i);
			System.out.print(item+" ");
		}
		System.out.println();
		ll.remove(3);
		for(int i=0;i<ll.size();i++)
		{
			int item=(Integer)ll.get(i);
			System.out.print(item+" ");
		}
		
		ll.reverse();
		
		System.out.println();
		for(int i=0;i<ll.size();i++)
		{
			int item=(Integer)ll.get(i);
			System.out.print(item+" ");
		}
	}

}
