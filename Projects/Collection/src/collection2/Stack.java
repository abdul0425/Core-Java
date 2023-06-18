package collection2;

public class Stack {

	private Node first;
	private int count;
	
	public void add(Object e)
	{
		if(first==null)
		{
			first=new Node(e,null);
			count++;
			return;
		}
		first=new Node(e,first);
		count++;
	}
	public int size()
	{
		return count;
	}
	public Object peek()
	{
		if(first==null)return null;
		return first.ele;
	}
	public boolean isEmpty()
	{
		if(first==null)return true;
		return false;
	}
	public Object poll()
	{
		if(first==null)return null;
		Object e=first.ele;
		first=first.next;
		count--;
		return e;
	}
}
