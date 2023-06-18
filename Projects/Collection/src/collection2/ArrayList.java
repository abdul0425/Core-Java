package collection2;

public class ArrayList {

	private Object[] a;
	private int count;
	
	public int size()
	{
		return count;
	}
	public void incCapacity()
	{
		Object[] temp=new Object[a.length+5];
		for(int i=0;i<a.length;i++)
			temp[i]=a[i];
		a=temp;
	}
	ArrayList()
	{
		a=new Object[10];
	}
	ArrayList(int initialCapacity)
	{
		a=new Object[initialCapacity];
	}
	public void add(Object e)
	{
		if(count>=a.length)
			incCapacity();
		a[count++]=e;
	}
	public void add(int index,Object e)
	{
		if(index<0 || index>=a.length)
			throw new IndexOutOfBoundsException();
		if(count>=a.length)
			incCapacity();
		for(int i=size()-1;i>=index;i--)
			a[i+1]=a[i];
		a[index]=e;
		count++;
	}
	public Object get(int index)
	{
		if(index<0 || index>=size())
			throw new IndexOutOfBoundsException();
		return a[index];
	}
	public void remove(int index)
	{
		if(index<0 || index>=size())
			throw new IndexOutOfBoundsException();
		for(int i=index+1;i<size();i++)
			a[i-1]=a[i];
		count--;
		a[count]=null;
	}
}
