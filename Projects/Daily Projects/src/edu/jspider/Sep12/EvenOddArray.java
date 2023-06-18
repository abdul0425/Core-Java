package edu.jspider.Sep12;

public class EvenOddArray {

	static void evenOdd(int[]a,int[]b)
	{
		int j=0;
		
		// Adding Even Number to the Array.
		for(int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				b[j++]=a[i];
		}
		
		// Adding Odd no to the Array.
		for(int k=0;k<a.length;k++)
		{
			if(a[k]%2!=0)
				b[j++]=a[k];
		}
	}
	
	
	public static void main(String[] args) {
		int[] a= {1,2,5,4,7,8,11,20};
		int[] b=new int[a.length];
		evenOdd(a,b);
		
		for(int n:b)
			System.out.print(n+", ");
		
	}
}
