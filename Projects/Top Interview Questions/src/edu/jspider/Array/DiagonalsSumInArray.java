package edu.jspider.Array;

public class DiagonalsSumInArray {

	static int sum(int[][]a)
	{
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i][i];
			if(a.length%2!=0 && i==a.length/2)
				continue;
			sum+=a[i][a.length-1-i];
		}
		return sum;
	}
	public static void main(String[] args) {
		int[][] a= {
				{1,2,3,4},
				{4,3,2,1},
				{5,6,7,8},
				{8,7,6,5}
		};
		int[][] b= {
				{1,2,3,4,5},
				{5,4,3,2,1},
				{5,6,7,8,9},
				{9,8,7,6,5},
				{1,2,3,4,5}
		};
		System.out.println("Diagonal's Sum : "+sum(a));
		System.out.println("Diagonal's Sum : "+sum(b));
	}
}
