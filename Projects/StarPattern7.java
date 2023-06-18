package print.java;

public class StarPattern7 
{

	public static void main(String[] args)
	{
		int row; int column; int star;
		
		for ( row=1; row<=5; row++)
		{
			for ( column=4; column>=row; column++)
			{
				System.out.print(" ");
			}
			for ( star=1; star<=row; star++)
			{
				System.out.print(" *");
			}
			System.out.println();
		}
	}

}
