import java.util.Scanner;
class NthFibonacciValue
{
	public static void main(String[] args)
	{
		System.out.println("enter nth number to find value :");
		int number=new Scanner(System.in).nextInt();
		int num1=0; int num2=1; int sum;
		
		for(int i=1; i<=number; i++)
		{
			sum=num1+num2;
			num1=num2;
			num2=sum;
			if(i==number)
				System.out.println("N'th value : " + num1);
		}
		
	}
}