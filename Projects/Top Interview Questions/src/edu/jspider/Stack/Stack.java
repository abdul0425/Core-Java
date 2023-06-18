package edu.jspider.Stack;

import java.util.EmptyStackException;

public class Stack {

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
		first=new Node(e,first);
		count++;
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
	public boolean isEmpty()
	{
		if(first==null)
			return true;
		else
			return false;
	}
	public Object get()
	{
		if(first==null)
			throw new EmptyStackException();
		Object e=first.ele;
		first=first.next;
		count--;
		return e;
	}
}
