package edu.jspider.Sep10;

public class ArrayList {
	private Object[] a;
	private int count;
	
	
	ArrayList()
	{
		a=new Object[5];
	}
	
	public void add(Object ele)
	{
		if(count>=a.length)
			increaseCapacity();
		a[count++]=ele;
	}
	
	public void add(int index,Object ele)
	{
		if(count>=a.length)
			increaseCapacity();
		if(index<0 || index>=size())
			throw new IndexOutOfBoundsException();
		for(int i=size()-1;i>=index;i--)
			a[i+1]=a[i];
		a[index]=ele;
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
	
	public int size()
	{
		return count;
	}
	
	public void increaseCapacity()
	{
		Object[] temp=new Object[a.length+3];
		for(int i=0;i<a.length;i++)
			temp[i]=a[i];
		a=temp;
	}
}
