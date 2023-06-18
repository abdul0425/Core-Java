package collection4;

public class StackImplement {

	public static void main(String[] args) {
		Stack q=new Stack();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		q.add(10);
		
		int size=q.size();
		for(int i=0;i<size;i++)
		{
			int n=(Integer)q.get();
			System.out.println(n);
		}
	}
}
