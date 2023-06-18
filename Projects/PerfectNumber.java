import java.util.Scanner;
class PerfectNumber
{
	public static void main(String[] args)
	{
		System.out.println("enter a number");
		int number = new Scanner(System.in).nextInt();
		int sum=0;
		
		for(int i=1; i<=number/2; i++)
		{
			if(number%i==0)
			{
				System.out.print(i + " ");
				sum=sum+i;
			}	
		}
		System.out.println("sum= " + sum);
		System.out.println();
		if(sum==number)
			System.out.println(number + " : Perfect Number");
		else
			System.out.println(number + " :Not Perfect Number");
	}
}