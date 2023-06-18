import java.util.Scanner;
class ArmstrongNumber
{
	public static void main(String[] args)
	{
		System.out.println("enter a number:");
		int number = new Scanner(System.in).nextInt();
		int count=0; int temp=number;
		
		while(number>0)
		{
			count++;
			number = number/10;
		}
		System.out.println("count : " + count);
		number = temp; int sum=0; 
		while(number>0)
		{
			int product=1;
			int digit = number%10;
			for(int i=1; i<=count; i++)
			{
				product = product*digit;
			}
			number=number/10;
			sum=sum+product;
		}
		System.out.println("Sum : " + sum);
		
		if (sum==temp)
			System.out.println("Armstrong Number");
		else
			System.out.println("Not Armstrong Number");
		
	}
}