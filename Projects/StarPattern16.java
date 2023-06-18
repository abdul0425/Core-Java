package print.java;

public class StarPattern16 
{

	public static void main(String[] args) 
	{
		int i; int j; int spaces=4; int star=1;
		for ( i=1; i<=5; i++)
		{
			for ( j=1; j<=spaces; j++)
			{
				System.out.print(" ");
			}
			for (j=1; j<=star; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			spaces--;
			star+=2;
		}
	}

}
