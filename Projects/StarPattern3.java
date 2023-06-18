package print.java;

public class StarPattern3
{

	public static void main(String[] args)
	{
		int row; int column; 
		
		
		for ( row = 1; row<=10; row++)
		{
			for ( column = 1; column<=row; column++)
			{
				System.out.print("* ");
			}
			System.out.println();
		}//System.out.println();
		for ( row = 1; row<=10; row++)
		{
			for ( column = 9; column>=row; column--)
			{
				System.out.print("* ");
			}
			System.out.println();
		}

	}

}
