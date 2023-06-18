package edu.jspider.July16;

public class LinkedListImplement {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add(50);
		l.add(40);
		l.add(70);
		l.add(30);
		l.add(80);
		l.add(30);
		
		for(int i=0;i<l.size();i++)
		{
			int n=(Integer)l.get(i);
			System.out.println(n);
		}
	}
	
}
