package edu.jspider.Pattern;

public class V {

	static void vPattern (int n)
	{
		for (int i=1; i<=n; i++)
		{
			for (int j=1; j<=n; j++)
			{
				if (((j==1 || j==n) && i<=(n/2)+1) || (i>n/2 && i-j==n/2))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
			}
		System.out.println();
		}
	}
	
	public static void main(String[] args) {
		vPattern(11);
	}

}
