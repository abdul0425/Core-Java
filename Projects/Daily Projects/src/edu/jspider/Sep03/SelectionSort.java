package edu.jspider.Sep03;

public class SelectionSort {

	public static void selection(int[] a)
	{
		for(int i=0;i<a.length;i++)
		{
			int min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[min]>a[j])
					min=j;
			}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
	}
	
	
	public static void main(String[] args) {
		int[] a= {5,4,3,2,1};
		selection(a);
		for(int n:a)
			System.out.print(n+" ");
	}

}
