package edu.jspider.Sep08;

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
		Node curr=first;
		while(curr.next!=null)
			curr=curr.next;
		curr.next=new Node(ele,null);
		count++;
	}
	
	public int size()
	{
		return count;
	}
	
	public void add(int index,Object ele)
	{
		if(index<=-1 || index>=size())
			throw new IndexOutOfBoundsException();
		if(index==0)
			{
				first=new Node(ele,first);
				count++;
			}
		Node curr=first;
		for(int i=1;i<index;i++)
			curr=curr.next;
		curr.next=new Node(ele,curr.next);
		count++;
	}
	
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
		Node curr=first;
		for(int i=1;i<index;i++)
			curr=curr.next;
		curr.next=curr.next.next;
		count--;
	}
	
	public void clearAll()
	{
		first=null;
		count=0;
	}
}
