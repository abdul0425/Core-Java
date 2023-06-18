import java.util.Scanner;

class ArmstrongNumber1
{
	public static void main(String[] args)
	{
		System.out.println("Enter a Number");
		int n = new Scanner(System.in).nextInt();
		int digits=0; int temp=n;
		
		while(n>0)
		{
			digits++;
			n=n/10;
		}
		System.out.println("Digits Available " +digits);
		n=temp; int d; int sum=0;
		
		while(n>0)
		{
			int product=1;
			d = n%10;
			for(int i=1; i<=digits; i++)
			{
				product=product*d;
				
			}
			n=n/10;
			sum=sum+product;
		}
		System.out.println("Sum :" + sum);
		n=temp;
		if(sum==n)
			System.out.println(n+": is Armstrong Number.");
		else
			System.out.println(n+": Not Armstrong Number.");
	}
}