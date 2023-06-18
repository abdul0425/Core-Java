package edu.jspider.Sep16;

public class Stack {

	private Node first;
	private int count;
	
	
	public void push(Object e)
	{
		if(first==null)
		{
			first=new Node(e,null);
			count++;
			return;
		}
		first=new Node(e,first);
		count++;
	}
}
