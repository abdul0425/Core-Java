package edu.jspider.Sep06;

public class ArrayList {
	private Object[] a;
	private int count;
	
	ArrayList()
	{
		a=new Object[5];
	}
	
	// OverLoaded Constructor.
	ArrayList(int initialCapacity)
	{
		a=new Object[initialCapacity];
	}
	
	// Add method.
	public void add(Object ele)
	{
		if(count>=a.length)
			increaseCapacity();
		a[count++]=ele;
	}
	
	//Add Element at Particular index.
	public void add(int index,Object ele)
	{
		if(index<=-1 || index>=size())
			throw new IndexOutOfBoundsException();
		if(count>=a.length)
			increaseCapacity();
		for(int i=size()-1;i>=index;i--)
			a[i+1]=a[i];
		a[index]=ele;
		count++;
	}
	
	
	//Increase Capacity Method
	public void increaseCapacity()
	{
		Object[] temp=new Object[a.length+3];
		for(int i=0;i<a.length;i++)
			temp[i]=a[i];
		a=temp;
	}
	
	
	//Size Method.
	public int size()
	{
		return count;
	}
	
	
	//Add Element at Particular Index.
	public Object get(int index)
	{
		if(index<=-1 || index>=size())
			throw new IndexOutOfBoundsException();
		return a[index];
	}
	
	//Remove Element Method.
	public void remove(int index)
	{
		if(index<=-1 || index>=size())
			throw new IndexOutOfBoundsException();
		for(int i=index+1;i<size();i++)
			a[i-1]=a[i];
		count--;
		a[count]=null;
	}
}
