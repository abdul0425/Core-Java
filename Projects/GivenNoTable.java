package print.java; import java.util.Scanner;

public class GivenNoTable {

	public static void main(String[] args) 
	{
		int iteration ; int table = 0;
		System.out.println(" Enter the Number : ");
		int number = new Scanner(System.in).nextInt();
		for ( iteration = 1 ; iteration <= 10 ; iteration++ )
		{
			table = iteration * number;
			System.out.println(number + " x " + iteration + " = " + table);
		}

	}

}
