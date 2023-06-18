package edu.jspider.Sep20;

import java.util.EmptyStackException;

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
	public boolean isEmpty()
	{
		if(first==null)
			return true;
		return false;
	}
	public int size()
	{
		return count;
	}
	public Object peek()
	{
		if(first==null)
			throw new EmptyStackException();
		return first.ele;
	}
	public Object pop()
	{
		if(first==null)
			throw new EmptyStackException();
		Object e=first.ele;
		first=first.next;
		count--;
		return e;
	}
}
