package collection2;

public class SetInt {

	private SetNode[] a=new SetNode[10];
	private int count=0;
	
	public boolean add(int k)
	{
		int loc=k%a.length;
		if(a[loc]==null)
		{
			a[loc]=new SetNode(k,null);
			count++;
			return true;
		}
		SetNode curr=a[loc];
		SetNode prev=null;
		while(curr!=null)
		{
			if(k==curr.key)
				return false;
			prev=curr;
			curr=curr.next;
		}
		prev.next=new SetNode(k,null);
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
			SetNode curr=a[i];
			while(curr!=null)
			{
				System.out.print(curr.key+" ");
				curr=curr.next;
			}
		}
		System.out.println();
	}
}
