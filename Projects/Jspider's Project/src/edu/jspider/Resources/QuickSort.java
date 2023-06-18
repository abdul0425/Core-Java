package edu.jspider.Resources;

public class QuickSort {
	public static void quick(int[]a,int start,int end)
	{
		if(start>=end)return;
		int i=start; int j=end;
		int pivot=a[(start+end)/2];
		if(i<=j)
		{
			while(a[i]<pivot)i++;
			while(a[j]>pivot)j--;
		}
		if(i<=j)
		{
			int temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			i++;
			j--;
		}
		quick(a,start,j);
		quick(a,i,end);
	}
}
