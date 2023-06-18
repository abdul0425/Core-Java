package edu.jspider.Sep03;

public class BubbleSort {

	public static void bubble(int[] a)
	{
		for(int i=0;i<a.length-1;i++)
		{
			for(int j=0;j<a.length-1-i;j++)
			{
				if(a[j]>a[j+1])
				{
					int temp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] a= {5,4,3,2,1};
		bubble(a);
		for(int n:a)
			System.out.print(n+" ");
	}

}
