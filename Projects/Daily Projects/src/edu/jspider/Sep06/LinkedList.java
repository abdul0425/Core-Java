package edu.jspider.Sep06;

public class LinkedList {
	private Node first;
	private int count;
	
	
	//Add method.
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
		{
			curr=curr.next;
		}
		curr.next=new Node(e,null);
		count++;
	}
	
	//Add element at Particular Index.
	public void add(int index,Object e)
	{
		if(index<=-1 || index>=size())
			throw new IndexOutOfBoundsException();
		if(index==0)
		{
			first=new Node(e,first);
			count++;
			return;
		}
		Node curr=first;
		for(int i=1;i<index;i++)
			curr=curr.next;
		curr.next=new Node(e,curr.next);
		count++;
	}
	
	// Size of Linked List.
	public int size()
	{
		return count;
	}
	
	// Get element from LinkedList.
	public Object get(int index)
	{
		if(index<=-1 || index>=size())
			throw new IndexOutOfBoundsException();
		Node curr=first;
		for(int i=1;i<=index;i++)
			curr=curr.next;
		return curr.ele;
	}
	
	public void remove(int index)
	{
		if(index<=-1 || index>=size())
			throw new IndexOutOfBoundsException();
		if(index==0)
		{
			first=first.next;
			count--;
			return;
		}
		
		Node curr=first;
		for(int i=1;i<index;i++)
			curr=curr.next;
		curr.next=curr.next.next;
		count--;
	}
}
