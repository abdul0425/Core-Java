package edu.jspider.Array;

public class NthLargestElementInArray {

	static void sort(int[] a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				
				if(a[j]<a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	
	static void sort1(int[] a,int k)
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				if(a[i]<a[j])
				{
					int temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}
			}
			if(i==k-1)
			{
				System.out.println(k+"th largest element : "+a[i]);
				break;
			}
		}
	}
	
	public static void main(String[] args) {
		int[] a= {60,40,30,90,70,20,10,80,50,100};
		sort(a);
		System.out.println("Descending Order : ");
		for(int n:a)
			System.out.println(n);
		//System.out.println("5th largest Element  :  "+a[4]);
		sort1(a,5);
	}
}
