package collection1;

public class QueueImplement {

	public static void main(String[] args) {
		Queue q=new Queue();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		
		int size=q.size();
		for(int i=0;i<size;i++)
		{
			int num=(Integer)q.poll();
			System.out.println(num);
		}
	}
}
