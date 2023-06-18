package print.java;

public class StarPattern17 
{

	public static void main(String[] args) 
	{
		int i; int j; int spaces=9; int star=1;
		for ( i=1; i<=10; i++)
		{
			for ( j=1; j<=spaces; j++)
			{
				System.out.print(" ");
			}
			for (j=1; j<=star; j++)
			{
				if (j==1 || j==star || i==10)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			spaces--;
			star+=2;
		}
	}

}
