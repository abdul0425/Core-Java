package edu.jspider.Aug30;

public class Pattern {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(j+"\t");
			}
			for(int k=4;k>=i;k--)
			{
				System.out.print(i+"\t");
			}
			System.out.println();
		}
	}

}
