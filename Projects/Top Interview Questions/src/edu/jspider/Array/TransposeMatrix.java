package edu.jspider.Array;

public class TransposeMatrix {

	static void transpose(int[][] a)
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
				{1,2,3},
				{4,5,6},
				{7,8,9}
		};
		transpose(a);
	}
}
