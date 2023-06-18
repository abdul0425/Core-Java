package edu.jspider.July19;

public class QuickSort {

	static void quick(int[]a,int start,int end)
	{
		if(start>=end)return;
		int i=start,j=end;
		int pivot=a[(start+end)/2];
		while(a[i]<pivot)i++;
		while(a[j]>pivot)j--;
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
