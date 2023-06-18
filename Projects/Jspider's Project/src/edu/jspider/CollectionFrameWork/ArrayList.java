package edu.jspider.CollectionFrameWork;

public class ArrayList {
	private Object[] array;
	private int count;
	
	// Initial Object type ArrayList will be Created.
	public ArrayList()
	{
		array =new Object[5];
	}
	
	// if you know the Order Capacity. then create ArrayList by this.
	public ArrayList(int initialCapacity)
	{
		array=new Object[initialCapacity];
	}
	
	// To Add element into ArrayList.
	public void add(Object element)
	{
		if(count>=array.length)
			increaseCapacity();
		array[count]=element;
		count++;
	}
	
	//To Get the ArrayList Size.
	public int size()
	{
		return count;
	}
	
	// To Add Element at Particular Index into ArrayList.
	public void add(int index,Object element)
	{
		if(index<=-1 || index>=size())
			throw new IndexOutOfBoundsException();
		if(count>=array.length)
			increaseCapacity();
		for(int i=size()-1;i>=index;i--)
			array[i+1]=array[i];
		array[index]=element;
		count++;
	}
	
	// To Increase the ArrayList Capacity if filled.
	public void increaseCapacity()
	{
		Object[] temp=new Object[array.length+3];
		
		for(int i=0;i<array.length;i++)
			temp[i]=array[i];
		array=temp;
	}
	
	// To Get the Element From ArrayList.
	public Object get(int index)
	{
		if(index<=-1 || index>=size())
			throw new IndexOutOfBoundsException();
		return array[index];
	}
	
	// To Remove an Element From ArrayList.
	public void remove(int index)
	{
		if(index<=-1 || index>=size())
			throw new IndexOutOfBoundsException();
		
		for(int i=index+1;i<size();i++)
			array[i-1]=array[i];
		count--;
		array[count]=null;
	}
	
	// To make ArrayList Empty.
	public void clear()
	{
		array=new Object[5];
		count=0;
	}
}
