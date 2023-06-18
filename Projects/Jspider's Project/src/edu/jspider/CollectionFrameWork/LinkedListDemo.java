package edu.jspider.CollectionFrameWork;

public class LinkedListDemo {

	public static void main(String[] args) {
		Linkelist l1=new Linkelist();
		l1.add(10);
		l1.add(20);
		l1.add(30);
		l1.add(40);
		l1.add(50);
		
		//l1.remove(2);
		//l1.add(3, 100);
		for(int i=0;i<l1.size();i++)
		{
			int n=(Integer)l1.get(i);
			System.out.println(n+" ");
		}
	}

}
