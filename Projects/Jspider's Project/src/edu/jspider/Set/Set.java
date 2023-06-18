package edu.jspider.Set;

public class Set {

	private Node[] a=new Node[10];
	private int count;
	
	//public boolean add(int e)
	public boolean add(Object e)
	{
		//int location=e%a.length;
		int location=e.hashCode()%a.length;
		if(a[location]==null)
		{
			a[location]=new Node(e,null);
			count++;
			return true;
		}
		Node curr=a[location];
		Node prev=curr;
		while(curr!=null)
		{
			//if(e==curr.key)return false;
			if(e.equals(curr.key))return false;
			prev=curr;
			curr=curr.next;
		}
		prev.next=new Node(e,null);
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
				System.out.println(curr.key+" ");
				curr=curr.next;
			}
			
		}
		System.out.println();
	}
}
