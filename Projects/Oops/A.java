import java.util.Scanner;

class A
{
	public static void main(String[] args)
	{
		System.out.println("Enter a Number");
		int n = new Scanner(System.in).nextInt();
		int star = 1;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=star; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			if(i<n/2)
				star++;
			else
				star--;
		}
	}
}