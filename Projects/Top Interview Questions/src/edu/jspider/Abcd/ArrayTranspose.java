package edu.jspider.Abcd;

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
		int[][]a= {
				{10,20,30},
				{40,50,60},
				{70,80,90}
		};
		transpose(a);
		
	}
}
