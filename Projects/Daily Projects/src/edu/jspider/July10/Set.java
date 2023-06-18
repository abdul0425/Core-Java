package edu.jspider.July10;

public class Set {
	private Node[] a=new Node[10];
	private int count;
	
	
	public boolean add(int k)
	{
		int location=k%a.length;
		if(a[location]==null)
		{
			a[location]=new Node(k,null);
			count++;
			return true;
		}
		Node curr=a[location];
		Node prev=null;
		while(curr!=null)
		{
			if(k==curr.key)
				return false;
			prev=curr;
			curr=curr.next;
		}
		prev.next=new Node(k,null);
		count++;
		return true;
	}
	
	public int size()
	{
		return count;
	}
	
	public void display()
	{
		for(int i=0;i<a.length;i++)
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
}
