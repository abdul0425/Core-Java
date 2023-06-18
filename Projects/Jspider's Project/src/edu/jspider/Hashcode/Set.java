package edu.jspider.Hashcode;

public class Set {

	private Node[] a=new Node[10];
	private int count=0;
	
	
	public boolean add(Object e)
	{
		int location=e.hashCode()%a.length;
		if(a[location]==null)
		{
			a[location]=new Node(e,null);
			count++;
			return true;
		}
		Node curr=a[location];
		Node prev=null;
		while(curr!=null)
		{
			if(e.equals(curr.key))return false;
			prev=curr;
			curr=curr.next;
		}
		prev.next=new Node(e,null);
		count++;
		return true;
	}
	
	public void display()
	{
		for(int i=0;i<size();i++)
		{
			Node curr=a[i];
			while(curr!=null)
			{
				System.out.print(curr.key+" ");
				curr=curr.next;
			}
		}
		System.out.println();
	}
	public int size()
	{
		return count;
	}
}
