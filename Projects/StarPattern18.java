package print.java; import java.util.Scanner;

public class StarPattern18 
{

	public static void main(String[] args) 
	{
		System.out.println("Enter a number :");
		int n = new Scanner(System.in).nextInt();
		int i; int j; int space=n/2; int star=1;
		for (i=1; i<=n; i++)
		{
			for (j=1; j<=space; j++)
			{
				System.out.print(" ");
			}
			for ( j=1; j<=star; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
			if( i<n/2)
			{
				space--;
				star+=2;
			}
			else
			{
				space++;
				star-=2;
			}
		}
		
	}

}
