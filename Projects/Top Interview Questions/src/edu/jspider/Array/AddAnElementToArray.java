package edu.jspider.Array;

public class AddAnElementToArray {

	static void addElement(int[] a,int element,int index)
	{
		for(int i=a.length-1;i>=index;i--)
			a[i]=a[i-1];
		a[index]=element;
	}
	public static void main(String[] args) {
		int[] a= {10,20,30,40,50};
		addElement(a,100,3);
		System.out.print("Element's : ");
		for(int n:a)
			System.out.print(n+" ");
	}
}
