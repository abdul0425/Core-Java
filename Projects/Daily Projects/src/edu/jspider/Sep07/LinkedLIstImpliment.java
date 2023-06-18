package edu.jspider.Sep07;

public class LinkedLIstImpliment {

	public static void main(String[] args) {
		LinkedList li=new LinkedList();
		li.add(10);
		li.add(20);
		li.add(30);
		li.add(40);
		li.add(50);
		
//		for(int i=0;i<li.size();i++)
//		{
//			int n=(Integer)li.get(i);
//			System.out.println(n);
//		}
		
//		li.add(3, 80);
//		for(int i=0;i<li.size();i++)
//		{
//			int n=(Integer)li.get(i);
//			System.out.println(n);
//		}
		
//		li.remove(2);
//		for(int i=0;i<li.size();i++)
//		{
//			int n=(Integer)li.get(i);
//			System.out.println(n);
//		}
		
		li.clear();
		for(int i=0;i<li.size();i++)
		{
			int n=(Integer)li.get(i);
			System.out.println(n);
		}
	}

}
