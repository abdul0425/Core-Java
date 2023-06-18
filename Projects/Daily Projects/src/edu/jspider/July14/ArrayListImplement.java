package edu.jspider.July14;

public class ArrayListImplement {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add("Arshad Alam");
		l.add("Mehmed Arsalan");
		l.add("Noori Khatoon");
		l.add("Nikhat Perween");
		l.add("Raja Babu");
		l.add("Sara Hayat");
		
		l.add(3, "Basarat Ali Ansari");
		l.remove(5);
		
		for(int i=0;i<l.size();i++)
		{
			String family=(String)l.get(i);
			System.out.println("Family Member's   :   "+family);
		}
	}
}
