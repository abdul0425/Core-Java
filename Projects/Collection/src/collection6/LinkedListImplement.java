package collection6;

public class LinkedListImplement {

	public static void main(String[] args) {
		LinkedList l=new LinkedList();
		l.add("Arshad");
		l.add("Arshad");
		l.add("Mehmed");
		l.add("Arshad");
		l.add("Noorii");
		l.add("Arsalan", 1);
		for(int i=0;i<l.size();i++)
		{
			String name=(String)l.get(i);
			System.out.println(name);
		}
		System.out.println();
		l.remove(2);
		l.remove(3);
		for(int i=0;i<l.size();i++)
		{
			String name=(String)l.get(i);
			System.out.println(name);
		}
		
		System.out.println();
		l.reverse();
		for(int i=0;i<l.size();i++)
		{
			String name=(String)l.get(i);
			System.out.println(name);
		}
	}
}
