package edu.jspider.Sep08;

public class ArrayListImplement {

	
	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		
		for(int i=0;i<al.size();i++)
		{
			int n=(Integer)al.get(i);
			System.out.println(n);
		}
	}
}
