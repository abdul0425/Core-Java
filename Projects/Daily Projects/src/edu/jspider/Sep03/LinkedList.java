package edu.jspider.Sep03;

public class LinkedList {
	private Node first;
	private int count;
	
	
	public void add(Object ele)
	{
		if(first==null)
		{
			first=new Node(ele,null);
			count++;
			return;
		}
		// When having more than one node
		Node curr=first;
		while(curr.next!=null)
		{
			curr=curr.next;
		}
		curr.next=new Node(ele,null);
		count++;
	}
	
	// Add node to given Position.
	public void add(int index,Object ele)
	{
		if(index==0)
		{
			first=new Node(ele,first);
			count++;
			return;
		}
		
		if(index<=-1 || index>=size())
			throw new IndexOutOfBoundsException();
		Node curr=first;
		for(int i=1;i<index;i++)
		{
			curr=curr.next;
		}
		curr.next=new Node(ele,curr.next);
		count++;
	}
	
	public int size()
	{
		return count;
	}
	
	
	
	public Object get(int index)
	{
		if(index<=-1 || index>=size())throw new IndexOutOfBoundsException();
		Node curr=first;
		for(int i=1;i<=index;i++)
		{
			curr=curr.next;
		}
		return curr.ele;
	}
	
	//Remove Element From a Linked List.
	public void remove(int index)
	{
		if(index==0)
		{
			Node curr=first;
			first=curr.next;
			count--;
			return;
		}
		
		if(index<=-1 || index>=size())throw new IndexOutOfBoundsException();
		Node curr=first;
		for(int i=1;i<index;i++)
		{
			curr=curr.next;
		}
		curr.next=curr.next.next;
		count--;
	}
	
	//To Clear Linked List.
	public void clear()
	{
		first=null;
		count=0;
	}
}
