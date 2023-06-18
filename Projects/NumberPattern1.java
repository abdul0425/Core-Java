package print.java;

public class NumberPattern1
{

	public static void main(String[] args)
	{
		int i; int j;
		for ( i=1; i<=10; i++)
		{
			if ( i%2 != 0 )
			{
				for( j=1; j<=10; j++)
				{
					System.out.print("\t"+j);
				}
			}
			else
			{
				for ( j=10; j>=1; j--)
				{
					System.out.print("\t"+j);
				}
			}
			System.out.println();
		}
	}

}
