package collection2;

public class LinkedListImplement {
	public static void main(String[] args) {
	LinkedList a=new LinkedList();
	a.add("Arshad Alam");
	a.add("Rivu Naskar");
	a.add("Akhil Pandu");
	
	a.add(2, "Sai Pallavi");
	
	a.remove(3);
	
	for(int i=0;i<a.size();i++)
	{
		String name=(String)a.get(i);
		System.out.println("Names  :  "+name);
	}
	System.out.println();
	System.out.println("======================");
	a.reverse();
	for(int i=0;i<a.size();i++)
	{
		String name=(String)a.get(i);
		System.out.println("Names  :  "+name);
	}
}
}
