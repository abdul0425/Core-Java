import java.util.Scanner;

class StrongNumber
{
	public static void main(String[] args)
	{
		System.out.println("Enter a Number");
		int num = new Scanner(System.in).nextInt();
		int count = 0; int temp = num;
		
		while(num>0)
		{
			count++;
			num = num/10;
		}
		System.out.println("Digits available in given Number :"+count);
		num = temp; int sum = 0;
		while(num>0)
		{
			int factorial = 1;
			int digit = num%10;
			for(int i=1; i<=digit; i++)
			{
				factorial = factorial*i;
			}
			num = num/10;
			sum = sum + factorial;
		}
		System.out.println("Sum :" + sum);
		num = temp;
		if( sum == temp )
			System.out.println(num + ": is Strong Number");
		else
			System.out.println(num + ": Not Strong Number");
		
	}
}