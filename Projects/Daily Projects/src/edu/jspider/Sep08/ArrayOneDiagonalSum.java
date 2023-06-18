package edu.jspider.Sep08;

public class ArrayOneDiagonalSum {
	
	static void sum(int[][] a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i][i];
		}
		System.out.println("Sum : "+sum);
	}
	
	
	
	public static void main(String[] args) {
		int[][] a= {
				{1,2,3},
				{1,2,3},
				{1,2,3}
		};
		sum(a);
	}
}
