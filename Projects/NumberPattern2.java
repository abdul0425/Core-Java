package print.java;

public class NumberPattern2
{

	public static void main(String[] args) 
	{
		for ( int i=1; i<=5; i++)
		{
			if ( i%2 !=0 )
			{
				int count = (i-1)*5+1;
				for ( int j=1; j<=5; j++)
				{
					System.out.print(count + "\t");
					count++;
				}
				
			}
			else
			{
				int count = i*5;
				for ( int j=1; j<=5; j++ )
				{
					System.out.print(count + "\t");
					count--;

				}
			}
			System.out.println();

		}
	}

}
