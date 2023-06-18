package edu.jspider.PatternProgram;
import java.util.Scanner;
public class FullPyramid {

	public static void main(String[] args) {
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter number");
		int num = obj.nextInt();
		int space = num-1; int star = 1;
		for(int i=1; i<=num; i++)
		{
			for(int j=1; j<=space; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=star; k++)
			{
				System.out.print("*");
			}
			if(i<num/2)
			{
				space--;
				star+=2;
			}
			else
			{
				space++;
				star-=2;
			}
			System.out.println();
		}
	}

}
