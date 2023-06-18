package edu.jspider.Array;

public class Quick {

	static void sort(int[] arr,int start,int end)
	{
		if(start>=end)return;
		int pivot=arr[(start+end)/2];
		int i=start; int j=end;
		while(i<=j)
		{
			while(arr[i]<pivot)i++;
			while(arr[j]>pivot)j--;
			if(i<=j)
			{
				int temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
				i++;
				j--;
			}
		}
		sort(arr,start,j);
		sort(arr,i,end);
	}
	
	
	public static void main(String[] args) {
		int[] arr= {5,4,3,2,1};
		int len=arr.length;
		sort(arr,0,len-1);
		
		for(int n:arr)
		{
			System.out.print(n+" ");
		}
	}

}
