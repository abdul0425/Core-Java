package edu.jspider.Sep13;

public class LinkedListImlemet {

	public static void main(String[] args) {
		LinkedList ll=new LinkedList();
		ll.add("Arshad Alam");
		ll.add("Rivu Naskar");
		ll.add("Akhil Pandu");
		ll.add("Sk Ameen");
		ll.add("Pawan Reddy");
		
		ll.add(2, "Keerthi Suresh");
		ll.add("Pooja Hegde");
		
		//ll.remove(4);
		ll.reverse();
		
		for(int i=0;i<ll.size();i++)
		{
			String s=(String)ll.get(i);
			System.out.println(s);
		}
	}

}
