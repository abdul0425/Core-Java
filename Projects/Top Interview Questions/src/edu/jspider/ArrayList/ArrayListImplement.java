package edu.jspider.ArrayList;

public class ArrayListImplement {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add("Arshad Alam");
		l.add("Noorii Alam");
		l.add("Mehmed Arsalan");
		
		l.add(2, "Raja Babu");
		for(int i=0;i<l.size();i++)
		{
			String name=(String)l.get(i);
			System.out.println("Family Name  : "+name);
		}
		System.out.println("=====================");
		l.remove(2);
		for(int i=0;i<l.size();i++)
		{
			String name=(String)l.get(i);
			System.out.println("Family Name  : "+name);
		}
	}
}
