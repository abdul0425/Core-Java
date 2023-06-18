package edu.jspider.NumberPatterns;

public class MPattern {

	public static void main(String[] args) {
		for(int i=1; i<=5; i++)
		{
			for(int j=1; j<=5; j++)
			{
				if(j==1||j==5||i==j)
					System.out.print('*');
				else if(i<5/2 || i+j==6)
					System.out.print(" ");
			}
			System.out.println();
		}
	}

}
