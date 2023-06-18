package edu.jspider.Sep03;

public class LinkedListDemo {

	public static void main(String[] args) {
		LinkedList li=new LinkedList();
		li.add("Arshad");
		li.add("Rivu");
		li.add("Ameen");
		li.add("Pawan");
		li.add("Balu");
		
		//li.add(3, "Akhil");
		
		//li.remove(3);
		//li.remove(0);
		//li.clear();
		
		for(int i=0;i<li.size();i++)
		{
			String name=(String)li.get(i);
			System.out.println(name);
		}
	}

}
