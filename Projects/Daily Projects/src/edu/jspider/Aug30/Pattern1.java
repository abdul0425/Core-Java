package edu.jspider.Aug30;

public class Pattern1 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			if(i%2==0)
			{
				for(int j=i;j>=1;j--)
				{
					System.out.print(j+"\t");
				}
			}
			else
			{
				for(int j=1;j<=i;j++)
				{
					System.out.print(j+"\t");
				}
			}
			System.out.println();
		}
	}

}
