package edu.jspider.Sep11;

public class ArrayListImplement {

	public static void main(String[] args) {
		ArrayList al=new ArrayList();
		al.add("Arshad Alam");
		al.add("Rivu Naskar");
		al.add("Akhil Pandu");
		al.add("Sheik Ameen");
		al.add("Pawan Reddy");
		
		al.remove(1);
		al.add(3, "Balu Reddy");
		
		for(int i=0;i<al.size();i++)
			System.out.println((String)al.get(i));
	}

}
