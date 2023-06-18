package edu.jspider.Sep13;

public class ArrayListImplemen {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("Arshad Alam");
		al.add("Rivu Naskar");
		al.add("Akhil Pandu");
		al.add("Sk Ameen");
		al.add("Pawan Reddy");
		
		al.add(1, "Keerthi Suresh");
		
		//al.remove(5);
		
		for(int i=0;i<al.size();i++)
		{
			String name=(String)al.get(i);
			System.out.println("Student Names   :   "+name);
		}
		
		System.out.println("--------------------------");
		System.out.println("--------------------------");
		System.out.println(" ArrayList in Reverse Orde -");
		for(int i=al.size()-1;i>=0;i--)
		{
			String name=(String)al.get(i);
			System.out.println("Student Names   :   "+name);
		}
	}

}
