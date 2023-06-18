package edu.jspider.MenuDriven;

import java.util.Scanner;

public class MenuDrivenProgram 
{
	public static void main(String[] args)
	{
		
		
		while(true)
		{
			System.out.println("1. Reverse Number.");
			System.out.println("2. Armstrong Number.");
			System.out.println("3. Strong Number.");
			System.out.println("4. Automorphic Number.");
			System.out.println("5. Niven Number.");
			System.out.println("6. Sum Of Digit's.");
			System.out.println("7. Prime Number.");
			System.out.println("8. Perfect Number.");
			System.out.println();
			System.out.println("Enter Your Choice.....");
			
			Scanner obj = new Scanner(System.in);
			int choice = obj.nextInt();
			int num;
			
			if(choice == 1)
			{
				System.out.println("Enter a Number to Check for Reverse of a Number. ");
				num = obj.nextInt();
				int result = 0; int temp = num;
				while(num!=0)
				{
					int reminder = num%10;
					result = result*10 + reminder;
					num/=10;
				}
				System.out.println(temp+" : Reverse is -> "+result);
				
			}
			else if(choice == 2)
			{
				System.out.println("Enter a Number...");
				num = obj.nextInt(); int temp = num;
				int count = 0;
				while(num!=0)
				{
					count++;
					num/=10;
				}
				num = temp;  int sum = 0;
				while(num>0)
				{
					int product = 1;
					int digit = num%10;
					for(int i=1; i<=count; i++)
					{
						product = product*digit;
					}
					sum = sum+product;
					num/=10;
				}
				if(temp == sum)
					System.out.println(temp +" : is Automorphic");
				else
					System.out.println(temp +" : Not Automorphic");
			}
			else if(choice == 3)
			{
				System.out.println("Enter a Number...");
				num = obj.nextInt(); int temp = num;
				int count = 0;
				while(num!=0)
				{
					count++;
					num/=10;
				}
				num = temp;  int sum = 0;
				while(num>0)
				{
					int fact = 1;
					int digit = num%10;
					for(int i=1; i<=digit; i++)
					{
						fact = fact*i;
					}
					sum = sum+fact;
					num/=10;
				}
				if(temp == sum)
					System.out.println(temp +" : is Strong Number.");
				else
					System.out.println(temp +" : Not Strong Number.");
			}
			else if(choice == 4)
			{
				System.out.println("Enter a Number. ");
				int n = obj.nextInt();
				int sq = n*n; int temp = n;
				
				int len = 0;
				while(n!=0)
				{
					len++;
					n/=10;
				}
				n=temp;
				if(sq%(10*len) == temp)
					System.out.println(temp+" : is Automorphic.");
				else
					System.out.println(temp+" : is Not Automorphic.");
			}
			else if(choice == 5)
			{
				System.out.println("Check for Niven Number.");
			}
			else if(choice == 6)
			{
				System.out.println("Check for Sum Of Digit's.");
			}
			else if(choice == 7)
			{
				System.out.println("Check for Prime Number.");
			}
			else if(choice == 8)
			{
				System.out.println("Check for Perfect Number.");
			}
			else
			{
				System.out.println("Invalid Choice.");
			}
			System.out.println();
			System.out.println("Do you want to Continue ?  Y/y");
			char input = obj.next().charAt(0);
			if(input=='Y' || input=='y')
				continue;
			else
				break;
			
		}
	}

}
