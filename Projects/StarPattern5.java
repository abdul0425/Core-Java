package print.java;

public class StarPattern5 
{

	public static void main(String[] args) 
	{
		int row; int column;
		int star;
		
		for ( row=1; row<=5; row++)
		{
			for ( column=1; column<=row; column++)
			{
				System.out.print(" ");
			}
			for ( star=5; star>=row; star--)
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
