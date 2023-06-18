package edu.jspider.Array;

public class MultiplyTwoArray {

	static void multiply(int[][]a,int[][]b,int[][]c)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				int sum=0;
				for(int k=0;k<a.length;k++)
				{
					sum=sum+(a[i][k]*b[k][j]);
				}
				c[i][j]=sum;
			}
		}
	}
	public static void main(String[] args) {
		int[][] a= {
				{1,2},
				{3,4}
		};
		int[][] b= {
				{1,2},
				{3,4}
		};
		int size=a.length;
		int[][] c=new int[size][size];
		multiply(a,b,c);
		for(int[] t:c)
		{
			for(int n:t)
			{
				System.out.print(n+"\t");
			}
			System.out.println();
		}
	}
}
