package edu.jspider.July18;

public class ArrayListImplement {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add("Arshad Alam");
		l.add("Rivu Naskar");
		l.add("Akhil Pandu");
		
		l.add(1, "Sai Pallavi");
		l.remove(3);
		
		for(int i=0;i<l.size();i++)
		{
			String name=(String)l.get(i);
			System.out.println("Employee  :  "+name);
		}
	}
}
