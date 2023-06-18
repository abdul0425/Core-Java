package edu.jspider.Aug10;

public class Queue {

	private Node first;
	private int count;
	
	public void add(Object e)
	{
		if(first==null)
		{
			first=new Node(e,null);
			count++;
			return;
		}
		Node curr=first;
		while(curr.next!=null)
			curr=curr.next;
		curr.next=new Node(e,null);
		count++;
	}
	public Object peek()
	{
		if(first==null)
			return null;
		return first.ele;
	}
	public Object poll()
	{
		if(first==null)
			return null;
		Object e=first.ele;
		first=first.next;
		count--;
		return e;
	}
	public int size()
	{
		return count;
	}
}
