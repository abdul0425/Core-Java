package edu.jspider.Sep16;

public class QueueImplement {

	public static void main(String[] args) {
		Queue q=new Queue();
		q.add("Vijay Thalapathy");
		q.add("Ram Charan");
		q.add("Jr NTR");
		q.add("Allu Arjun");
		q.add("Mahesh Babu");
		
		int size=q.size();
		for(int i=0;i<size;i++)
		{
			String actor=(String)q.poll();
			System.out.println("Actor's name    :     "+actor);
		}
	}
}
