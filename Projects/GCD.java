import java.util.Scanner;

class GCD
{
	public static void main(String[] args)
	{
		System.out.println("1st Number :");
		int num1 = new Scanner(System.in).nextInt();
		System.out.println("2nd Number :");
		int num2 = new Scanner(System.in).nextInt();
		int Gcd = 0;
		int greater = num1>num2? num1: num2;
		
		for(int i=1; i<=greater/2; i++)
		{
			if(num1%i == num2%i)
			{
				Gcd = i;
			}
		}
		System.out.println(" GCD for "+num1+" & "+num2+" is "+ Gcd);
	}
}