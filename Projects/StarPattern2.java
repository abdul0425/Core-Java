package print.java;

public class StarPattern2
{
	public static void main(String[] args) 
	{	
		int row; int column; int number = 10;
		
		for ( row =1; row<=number; row++ )
		{
			for ( column =10; column>=row; column--)
			{
				System.out.print(" * ");
			}
			System.out.println("");
		}
		

	}

}
