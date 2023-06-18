package edu.jspider.July11;

public class LinkedListImplement {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("Ram Charan");
		l.add("Prabhas");
		l.add("Allu Arjun");
		l.add("Jr NTR");
		l.add("Ravi Teja");
		
		l.add(3, "Sai Pallavi");
		
		//l.remove(5);
		
		l.reverse();
		
		for(int i=0;i<l.size();i++)
		{
			String actor=(String)l.get(i);
			System.out.println(actor);
		}
	}

}
