package edu.jspider.SetInteger;

public class Set {

	private Node[] a=new Node[10];
	private int count;
	
	public boolean add(int k)
	{
		int loc=k%a.length;
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
	}
}
