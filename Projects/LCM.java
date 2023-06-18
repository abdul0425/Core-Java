import java.util.Scanner;

class LCM
{
	public static void main(String[] args)
	{
		System.out.println("Enter two Nmbers :");
	int num1 = new Scanner(System.in).nextInt();
	int num2 = new Scanner(System.in).nextInt();
	int greater = num1>num2? num1 : num2;
	
	for(int i=greater; i<=num1*num2; i+=greater)
	{
		if(i%num1 == i%num2)
		{
			System.out.println("Lcm for : " + num1 +" & "+ num2 + " is " + i);
			break;
		}
	}
	}
	
}