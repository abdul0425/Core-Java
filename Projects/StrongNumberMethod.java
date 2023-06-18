package print.java;

public class StrongNumberMethod 
{

	public static void main(String[] args) 
	{
		System.out.println(isNumberStrong(145));
		System.out.println(isNumberStrong(1));
		System.out.println(isNumberStrong(2));
		System.out.println(isNumberStrong(40585));
	}
	
	//  Strong Numbers : 1, 2, 145, 40585.
	
	static boolean isNumberStrong(int number)
	{
		int digit; int sum=0; int temp=number;
		
		while(number>0)
		{
			digit = number%10; int factorial=1;
			for(int i=1; i<=digit; i++)
			{
				factorial = factorial*i;
			}
			sum = sum+factorial;
			number = number/10;
		}
		System.out.println("Sum :" + sum);
		if(sum == temp)
			return true;
		else
			return false;
		
	}

}
