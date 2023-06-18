package edu.jspider.July16;

public class ArrayListImplement {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add("Arshad Alam");
		l.add("Rivu Naskar");
		l.add("Akhil Pandu");
		l.add("Keerthi Suresh");
		l.add("Sai Pallavi");
		l.add("Nayanthara");
		
		l.add(2, "Ram Charan");
		l.remove(3);
		
		for(int i=0;i<l.size();i++)
		{
			String s=(String)l.get(i);
			System.out.println("Employee  :  "+s);
		}
		
	}
}
