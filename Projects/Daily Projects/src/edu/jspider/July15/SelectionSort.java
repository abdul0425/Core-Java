package edu.jspider.July15;

public class SelectionSort {

	static void selection(int[]a)
	{
		for(int i=0;i<a.length;i++)
		{
			int min=i;
			for(int j=i+1;i<a.length;j++)
			{
				if(a[min]>a[j])
					min=j;
			}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
	}
}
