package edu.jspider.Sep03;

public class InsertionSort {

	public static void insertion(int[] a)
	{
		for(int i=1;i<a.length;i++)
		{
			int key=a[i];
			int j=i-1;
			while(j>-1 && key<a[j])
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1]=key;
		}
	}
	
	
	public static void main(String[] args) {
		int[] a= {5,4,3,2,1};
		insertion(a);
		for(int n:a)
			System.out.print(n+" ");
	}

}
