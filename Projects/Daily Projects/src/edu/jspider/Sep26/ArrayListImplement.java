package edu.jspider.Sep26;

public class ArrayListImplement {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("Jr NTR");
		al.add("Mahesh Babu");
		al.add("Allu Arjun");
		al.add("Ram Charan");
		al.add("Vijay Thalapaty");
		
		al.add(2, "Ram Pothineni");
		al.remove(1);
		al.clearAll();
		for(int i=0;i<al.size();i++)
		{
			String name=(String)al.get(i);
			System.out.println("Actor's Name   :   "+name);
			
		}
	}
}
