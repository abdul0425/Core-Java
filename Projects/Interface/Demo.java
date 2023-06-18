import java.util.Scanner;

class Pattern
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Entera Number :");
		int n = obj.nextInt();
		int temp=n;


		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print("* ");
			}
			for(int k=n-1; k>=i; k--)
			{
				System.out.print("# ");
			}
			System.out.println();
		}
	}
}