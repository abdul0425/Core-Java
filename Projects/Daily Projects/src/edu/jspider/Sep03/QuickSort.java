package edu.jspider.Sep03;

public class QuickSort {

	public static void quick(int[] a,int start,int end)
	{
		if(start>=end)return;
		int i=start; int j=end;
		int pivot=a[(start+end)/2];
		for(i=start;i<=end;i++)
		{
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
		}
		quick(a,start,j);
		quick(a,i,end);
	}
	
	public static void main(String[] args) {
		int[] a= {5,4,3,2,1};
		quick(a,0,a.length-1);
		for(int n:a)
			System.out.print(n+" ");
	}

}
