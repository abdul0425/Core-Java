package edu.jspider.Sep11;

public class QueueImplement {

	public static void main(String[] args) {
		Queue q=new Queue();
		q.add(10);
		q.add(20);
		q.add(30);
		q.add(40);
		q.add(50);
		q.add(60);
		q.add(70);
		
		
		System.out.println("Queue size  :   "+q.size());
		System.out.print("Queue Element's  : ");
		int size=q.size();
		for(int i=0;i<size;i++)
			System.out.print(q.poll()+" ");
			
			
	}

}
