package edu.jspider.Jun17;

class Node1
{
	Object o;
	int k;
	Node1 next;
	
	Node1(int k,Node1 n)
	{
		this.k=k;
		next=n;
	}
}

public class Set {
	private Node1[] a=new Node1[10];
	private int count=0;
	
	public boolean add(int n)
	{
		int loc=n%10;
		if(a[loc]==null)
		{
			a[loc]=new Node1(n,null);
			count++;
			return true;
		}
		Node1 curr=a[loc];
		Node1 prev=null;
		while(curr!=null)
		{
			if(n==curr.k)
				return false;
			prev=curr;
			curr=curr.next;
		}
		prev.next=new Node1(n,null);
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
			Node1 curr=a[i];
			while(curr!=null)
			{
				System.out.println(curr.k);
				curr=curr.next;
			}
		}
	}
}
