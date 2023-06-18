package edu.jspider.Array;

public class OneDiagonalSum {

	public static int sum(int[][]a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i][i];
		}
		return sum;
	}
	
	
	public static void main(String[] args) {
		int[][] a= {
				{1,2,3,4},
				{2,3,4,5},
				{3,4,5,6},
				{4,5,6,7}
		};
		
		int result=sum(a);
		System.out.println("One diagonal Sum : "+result);
	}

}
