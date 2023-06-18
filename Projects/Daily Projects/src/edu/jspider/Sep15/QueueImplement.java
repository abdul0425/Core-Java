package edu.jspider.Sep15;

public class QueueImplement {

	public static void main(String[] args) {
		Queue q=new Queue();
		q.add("Arshad Alam");
		q.add("Keerthi Suresh");
		q.add("Sai Pallavi");
		q.add("Raashi Khanna");
		q.add("Samantha");
		
		System.out.println("Peeked Element  :  "+q.peek());
		
		System.out.println("Queue size  :  "+q.size());
		
		int size=q.size();
		
		for(int i=0;i<size;i++)
			System.out.println(q.poll());
	}

}
