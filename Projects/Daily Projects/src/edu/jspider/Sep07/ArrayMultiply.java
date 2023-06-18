package edu.jspider.Sep07;

public class ArrayMultiply {

	static void multiply(int[][]a,int[][]b,int[][]c)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<b.length;j++)
			{
				int sum=0;
				for(int k=0;k<a.length;k++)
				{
					sum+=(a[i][k]*b[k][j]);
					c[i][j]=sum;
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[][] c=new int[2][2];
		
		int[][] a= {
				{1,2},
				{3,4}
		};
		int[][] b= {
				{1,2},
				{3,4}
		};
		
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
