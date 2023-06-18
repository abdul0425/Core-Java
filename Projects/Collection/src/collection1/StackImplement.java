package collection1;

public class StackImplement {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		
		System.out.println("Peeked Element  :  "+s.peek());
		
		int size=s.size();
		System.out.println("Poll Element  : ");
		for(int i=0;i<size;i++)
		{
			int num=(Integer)s.poll();
			System.out.println(num);
		}
		
		
		System.out.println("Is Stack Empty  :  "+s.isEmpty());
	}
}
