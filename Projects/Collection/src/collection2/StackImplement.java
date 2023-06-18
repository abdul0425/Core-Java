package collection2;

public class StackImplement {

	public static void main(String[] args) {
		Stack a=new Stack();
		a.add("Arshad Alam");
		a.add("Rivu Naskar");
		a.add("Akhil Pandu");
		a.add("Sai Pallavi");
		
		System.out.println(a.peek());
		System.out.println(a.isEmpty());
		int size=a.size();
		for(int i=0;i<size;i++)
		{
			String name=(String)a.poll();
			System.out.println("Names  :  "+name);
		}
		System.out.println(a.isEmpty());
	}
}
