package edu.jspider.Sep06;

public class ArrayListImplement {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		
//		for(int i=0;i<al.size();i++)
//		{
//			int n=(Integer)al.get(i);
//			System.out.println(n);
//		}
		
		al.remove(2);
		
		//al.add(2, 60);
		for(int i=0;i<al.size();i++)
		{
			int n=(Integer)al.get(i);
			System.out.println(n);
		}
	}

}
