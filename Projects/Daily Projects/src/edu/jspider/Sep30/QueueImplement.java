package edu.jspider.Sep30;

public class QueueImplement {

	public static void main(String[] args) {

		Queue q = new Queue();
		q.add("Jr NTR");
		q.add("Mahesh Babu");
		q.add("Allu Arjun");
		q.add("Ram Charan");
		q.add("Vijay Thalapaty");

		int size = q.size();
		//System.out.println(q.size());
		for (int i = 0; i < size; i++) {
			//String name = (String) q.poll();
			System.out.println("Actor's Name   :   " + q.poll());
		}
	}
}
