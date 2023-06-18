package edu.jspider.Queue;

public class QueueImplement {

	public static void main(String[] args) {
		Queue q=new Queue();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		
		int size=q.size();
		System.out.println(q.isEmpty());
		System.out.println(q.peek());
		for(int i=0;i<size;i++)
		{
			int num=(Integer)q.get();
			System.out.println(num);
		}
		System.out.println(q.isEmpty());
	}
}
