package collection2;

public class SetObject {

	private SetNodeObject[] a=new SetNodeObject[10];
	private int count;
	
	public boolean add(Object k)
	{
		int loc=k.hashCode()%a.length;
		if(a[loc]==null)
		{
			a[loc]=new SetNodeObject(k,null);
			count++;
			return true;
		}
		SetNodeObject curr=a[loc];
		SetNodeObject prev=null;
		while(curr!=null)
		{
			if(k.equals(curr.ele))
				return false;
			prev=curr;
			curr=curr.next;
		}
		prev.next=new SetNodeObject(k,null);
		count++;
		return true;
	}
	public void display()
	{
		for(int i=0;i<size();i++)
		{
			SetNodeObject curr=a[i];
			while(curr!=null)
			{
				System.out.println(curr.ele);
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
