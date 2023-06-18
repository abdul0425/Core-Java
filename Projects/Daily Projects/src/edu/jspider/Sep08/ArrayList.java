package edu.jspider.Sep08;

public class ArrayList {

	private Object[] a;
	private int count;
	
	
	public ArrayList()
	{
		a=new Object[5];
	}
	public ArrayList(int initialCapacity)
	{
		a=new Object[initialCapacity];
	}
	
	public void add(Object e)
	{
		if(count>=size())
			increaseCapacity();
		a[count++]=e;
	}
	
	public void add(int index,Object e)
	{
		if(index<=-1 || index>=size())
			throw new IndexOutOfBoundsException();
		for(int i=size()-1;i>=index;i--)
			a[i+1]=a[i];
		count++;
	}
	
	public Object get(int index)
	{
		if(index<=-1 || index>=size())
			throw new IndexOutOfBoundsException();
		return a[index];
	}
	
	public void remove(int index)
	{
		if(index<=-1 || index>=size())
			throw new IndexOutOfBoundsException();
		for(int i=index+1;i<size();i++)
			a[i-1]=a[i];
		count--;
		a[count]=null;
			
	}
	
	public int size()
	{
		return count;
	}
	
	private void increaseCapacity()
	{
		Object[] temp=new Object[a.length+3];
		for(int i=0;i<a.length;i++)
			temp[i]=a[i];
		a=temp;
	}
	
	public void clearAll()
	{
		a=new Object[5];
		count=0;
	}
}
