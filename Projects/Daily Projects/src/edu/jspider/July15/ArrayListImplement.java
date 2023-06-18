package edu.jspider.July15;

public class ArrayListImplement {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add("Arshad Alam");
		l.add("Rivu Naskar");
		l.add("Akhil Pandu");
		l.add("Raveesh Kumar");
		l.add("Kishore Kr Reddy");
		l.add("Joeson Sir");
		
		
		l.add(2, "Sai Pallavi");
		l.remove(5);
		
		for(int i=0;i<l.size();i++)
		{
			String emp=(String)l.get(i);
			System.out.println(emp);
		}
	}
}
