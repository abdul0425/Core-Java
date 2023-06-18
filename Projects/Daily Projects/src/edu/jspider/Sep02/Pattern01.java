package edu.jspider.Sep02;

public class Pattern01 {

	public static void main(String[] args) {
		int temp = 0;
		for(int i=1;i<=4;i++)
		{
			temp=temp+i;
			for(int j=temp;j>temp-i;j--)
			{
				System.out.print(j+"\t");
			}
			System.out.println();
		}
	}

}
