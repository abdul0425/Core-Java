package edu.jspider.Sep16;

public class ArrayList {

	private Object[] a;
	private int count;
	
	ArrayList()
	{
		a=new Object[5];
	}
	ArrayList(int initialCapacity)
	{
		a=new Object[initialCapacity];
	}
	
	public void add(Object e)
	{
		if(count>=a.length)
			increaseCapacity();
		a[count++]=e;
	}
	
	public void add(int index,Object e)
	{
		if(index<0 || index>=size())
			throw new IndexOutOfBoundsException();
		if(count>=a.length)
			increaseCapacity();
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
	
	public void increaseCapacity()
	{
		Object[] temp=new Object[a.length+3];
		for(int i=0;i<a.length;i++)
		{
			temp[i]=a[i];
		}
		a=temp;
	}
	
	public int size()
	{
		return count;
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
