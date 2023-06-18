package edu.jspider.SetObject;

public class Set {

	private Node[] a=new Node[10];
	private int count=0;
	
	public int size()
	{
		return count;
	}
	public boolean add(Object k)
	{
		int loc=(k.hashCode())%a.length;
		if(a[loc]==null)
		{
			a[loc]=new Node(k,null);
			count++;
			return true;
		}
		Node curr=a[loc];
		Node prev=null;
		while(curr!=null)
		{
			if(k.equals(curr.key))
				return false;
			prev=curr;
			curr=curr.next;
		}
		prev.next=new Node(k,null);
		count++;
		return true;
	}
	
	public void display()
	{
		for(int i=0;i<a.length;i++)
		{
			Node curr=a[i];
			while(curr!=null)
			{
				System.out.println(curr.key);
				curr=curr.next;
			}
		}
	}
}
