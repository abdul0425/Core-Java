package edu.jspider.Sep05;

public class LinkedList {
	private Node first;
	private int count;
	
	
	public void add(Object element)
	{
		if(first==null)
		{
			first=new Node(element,null);
			count++;
			return;
		}
		Node curr=first;
		while(curr.next!=null)
			curr=curr.next;
		curr.next=new Node(element,null);
		count++;
	}
	
	public int size()
	{
		return count;
	}
	
	public void add(int index,Object element)
	{
		if(index<=-1 || index>=size())
			throw new IndexOutOfBoundsException();
		Node curr=first;
		for(int i=1;i<index;i++)
		{
			curr=curr.next;
			
		}
		curr.next=new Node(element,curr.next);
		count++;
	}
	
	public Object get(int index)
	{
		if(index<=-1 || index>=size())
			throw new IndexOutOfBoundsException();
		Node curr=first;
		for(int i=1;i<=index;i++)
		{
			curr=curr.next;
		}
		return curr.element;
	}
	
	
	public void remove(int index)
	{
		if(index<=-1 || index>=size())
			throw new IndexOutOfBoundsException();
		if(index==0)
		{	first=first.next;
			count--;
			return;
		}
		
		Node curr=first;
		for(int i=1;i<index;i++)
		{
			curr=curr.next;
		}
		curr.next=curr.next.next;
		count--;
	}
	
	//Reverse the Linked List.
	public void reverse()
	{
		Node prev=null; Node curr=first; Node next=null;
		while(curr!=null)
		{
			next=curr.next;
			curr.next=prev;
			prev=curr;
			curr=next;
		}
		first=prev;
	}
}
