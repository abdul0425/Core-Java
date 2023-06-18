package edu.jspider.Sep16;

public class ArrayListImplement {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("Arshad Alam");
		al.add("Jr NTR");
		al.add("Ram Pothineni");
		al.add("Vijay Thalapathy");
		al.add("Ram Charan");
		
		al.add(2, "Allu Arjun");
		
		//al.remove(3);
		
		for(int i=0;i<al.size();i++)
		{
			String name=(String)al.get(i);
			System.out.println("Employee Name   :   "+name);
		}
	}
	
}
