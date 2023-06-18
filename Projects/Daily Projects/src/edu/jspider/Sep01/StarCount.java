package edu.jspider.Sep01;

public class StarCount {

	public static void main(String[] args) {
		for(int i=0;i<=5;i++)
		{
			System.out.print(i);
			for(int j=1;j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println();
		}
	}

}
