package edu.jspider.Array;

public class OneDiagonalElementSum {

	static int leftDiagonalSum(int[][]a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i][i];
		}
		return sum;
	}
	static int rightDiagonalSum(int[][] a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i][a.length-1-i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int[][] a= {
				{1,2,3,4},
				{4,3,2,1},
				{6,7,8,9},
				{9,8,7,6}
		};
		System.out.println("Left Diagonal Sum : "+leftDiagonalSum(a));
		System.out.println("Right Diagonal Sum : "+rightDiagonalSum(a));
	}
}
