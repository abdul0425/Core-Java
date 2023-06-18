package edu.jspider.Array;

public class TwoDiagonalSum {

	public static int sum(int[][]a)
	{
		int sum=0; int len=a.length;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i][i];
			if(len%2!=0 && i==len/2)continue;
			sum+=a[i][len-1-i];
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
		System.out.println("Two diagonal Sum : "+result);
	}

}
