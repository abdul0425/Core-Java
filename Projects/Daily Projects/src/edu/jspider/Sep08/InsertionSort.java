package edu.jspider.Sep08;

public class InsertionSort {

	
	static void insertion(int[]a)
	{
		for(int i=1;i<a.length;i++)
		{
			int key=a[i];
			int j=i-1;
			if(j>-1 && key<a[j])
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
	}
	
	public static void main(String[] args) {
		int[] a= {50,40,30,20,10};
		insertion(a);
		System.out.print("Sorted Array : ");
		for(int n:a)
			System.out.print(n+" ");
	}
}
