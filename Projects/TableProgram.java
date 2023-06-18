package print.java; import java.util.Scanner;

public class TableProgram
{

	public static void main(String[] args)
	{
		System.out.println(" Enter a number :");
		int number = new Scanner(System.in).nextInt();
		int i; 
		for ( i=1; i<=10; i++)
		{
			System.out.println(number +" x " + i + (" = ") + number*i);
		}
	}

}
