package edu.jspider.Array;

public class DeleteAnElementFromArray {

	static void removeElement(int[] a,int index)
	{
		for(int i=index+1;i<a.length;i++)
			a[i-1]=a[i];
	}
	public static void main(String[] args) {
		int[] a= {10,20,30,40,50};
		removeElement(a,3);
		System.out.print("Element's : ");
		for(int n:a)
			System.out.print(n+" ");
	}
}
