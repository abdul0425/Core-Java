package collection3;

public class LinkedListImplement {

	public static void main(String[] args) {
		LinkedList a=new LinkedList();
		a.add("Arshad Alam");
		a.add("Noorii Alam");
		a.add("Raja Alam");
		
		a.add(2,"Mehmed Arsalan");
		a.remove(3);
		
		for(int i=0;i<a.size();i++)
		{
			String name=(String)a.get(i);
			System.out.println("Family Name  :  "+name);
		}
		a.reverse();
		for(int i=0;i<a.size();i++)
		{
			String name=(String)a.get(i);
			System.out.println("Family Name  :  "+name);
		}
	}
}
