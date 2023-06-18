package edu.jspider.Sep06;

public class ArrayTranspose {

	
	static void transpose(int[][]a)
	{
		for(int i=0;i<a.length;i++)
		{
			for(int j=0;j<a.length;j++)
			{
				System.out.print(a[j][i]+"\t");
			}
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		int[][] a= {
				{1,2,3,4},
				{4,3,2,1},
				{5,6,7,8},
				{8,7,6,5}
		};
		
		transpose(a);
	}

}
