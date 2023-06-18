package edu.jspider.NumberPatterns;

import java.util.Scanner;

public class N1 {

	/*   01010
	 *   10101
	 *   01010
	 *   10101
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size ?");
		int num=sc.nextInt();
		
		for(int i=1; i<=num; i++)
		{
			for(int j=1; j<=num; j++)
			{
				if((i+j)%2==0)
					System.out.print(0+" ");
				else
					System.out.print(1+" ");
			}
			System.out.println();
		}
	}

}
