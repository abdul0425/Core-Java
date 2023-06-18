package edu.jspider.July13;

public class ArrayListImplement {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add("Ram Charan");
		l.add("Ram Pothineni");
		l.add("Allu Arjun");
		l.add("Prabhas");
		l.add("Ravi Teja");
		l.add("Vijay Thala");
		
		l.add(2, "Suriya");
		
		l.remove(6);
		
		for(int i=0;i<l.size();i++)
		{
			String actor=(String)l.get(i);
			System.out.println("Actor's Name  :  "+actor);
		}
	}
}
