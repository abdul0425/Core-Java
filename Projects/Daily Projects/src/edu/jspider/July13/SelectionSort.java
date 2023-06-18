package edu.jspider.July13;

public class SelectionSort {

	static void selection(int[]a)
	{
		for(int i=0;i<a.length;i++)
		{
			int min=i;
			for(int j=i+1;j<a.length;j++)
			{
				if(a[j]<min)
					min=j;
			}
			int temp=a[i];
			a[i]=a[min];
			a[min]=temp;
		}
	}
}
