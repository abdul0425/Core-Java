package edu.jspider.Aug30;

public class Pattern3 {
	public static void main(String[] args) {
		
		int num=5;
		for(int i=1;i<=5;i++)
		{
			for(int k=2;k<=i;k++)
			{
				System.out.print(" ");
			}
			for(int j=1;j<=num;j++)
			{
				if(i%2!=0)
				{
					System.out.print((char)(j+64));
				}
				else
					System.out.print(j);
			}
			num--;
			System.out.println();
		}
	}
}
