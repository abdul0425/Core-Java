package edu.jspider.July16;


public class Set {

	private Node[] a=new Node[10];
	private int count=0;
	
	
	/* public void incCapacity()
	{
		Node[] temp=new Node[a.length+5];
		for(int i=0;i<a.length;i++)
			temp[i]=a[i];
		a=temp;
	} */
	public boolean add(Object e)
	{
		//if(count>=a.length)
			//incCapacity();
		int loc=e.hashCode()%a.length;
		if(a[loc]==null)
		{
			a[loc]=new Node(e,null);
			count++;
			return true;
		}
		Node curr=a[loc];
		Node prev=null;
		while(curr!=null)
		{
			if(e.equals(curr.ele))
				return false;
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
				System.out.println("Name  :  "+curr.ele);
				curr=curr.next;
			}
		}
		System.out.println();
	}
}
