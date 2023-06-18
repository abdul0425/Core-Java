package edu.jspider.Resources;

import java.util.Scanner;

public class NumberProgram
{

	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		
		
		
		exit : while(true)
		{	
			System.out.println("1. Prime Number.");
			System.out.println("2. Prime Number in Range.");
			System.out.println("3. Fibonacci Numbers.");
			System.out.println("4. Strong Number.");
			System.out.println("5. Automorphic Number.");
			System.out.println("6. Automorphic Number in Range.");
			System.out.println("7. Exit");
			System.out.println();
			
			System.out.println("Choose Any Option :");
			int option = obj.nextInt();
			switch(option)
			{
			case 1 : PrimeNumber.main(args);break;
			case 2 : PrimeNumberInRange.main(args);break;
			case 3 : FibonacciSeries.main(args);break;
			case 4 : StrongNumber.main(args);break;
			case 5 : AutomorphicNumber.main(args);break;
			case 6 : AutomorphicNumberInRange.main(args);break;
			case 7 : break exit;
			default : System.out.println("Invalid input");break;	
			
			}
		}
		
	}

}
