package print.java;

public class StarPattern4 
{

	public static void main(String[] args) 
	{
		int row; int column; int star;
		
		for ( row=1; row<=5; row++)
		{
			// Printing Spaces :
			for (column=4; column>=row;column--)
			{
				System.out.print(".");
			}
			
			// Printing Star :
			for ( star=1; star<=row; star++)
			{
				System.out.print("*");
			}
			
			// Printing next line:
			System.out.println();
		}
		
	}

}
