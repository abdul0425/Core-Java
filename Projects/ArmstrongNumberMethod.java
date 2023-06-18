package print.java;

public class ArmstrongNumberMethod
{

	public static void main(String[] args) 
	{
		System.out.println(isNumberArmstrong(153));
	}
	
	static boolean isNumberArmstrong(int number)
	{
		// calculate power
		int power = 0; int temp = number;   int sum=0;
		while(number>0)
		{
			power++;
			number = number/10;
		}
		System.out.println("power:"+power);
		number = temp;
		
		while(number>0)
		{
			int product=1; int digit;
			digit = number%10;
			for(int i=1; i<=power; i++)
			{
				product = product*digit;
			}
			
			sum = sum+product;
			number = number/10;
		}
		System.out.println("sum:"+sum);
		if(sum == temp)
			return true;
		else
			return false;
		
	}

}
