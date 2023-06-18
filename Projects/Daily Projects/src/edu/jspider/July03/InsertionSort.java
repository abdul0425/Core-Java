package edu.jspider.July03;

public class InsertionSort {

	static void insertion(int[]a)
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
}
