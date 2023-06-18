package edu.jspider.PatternProgram;

public class Pattern3 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int j=2;j<=i;j++)
			{
				System.out.print(1+" ");
			}
			for(int k=1;k<=i;k++)
			{
				if(i==k)
					System.out.print("*"+" ");
			}
			for(int l=4;l>=i;l--)
			{
				System.out.print(0+" ");
			}
			System.out.println();
		}
	}

}
