package print.java; import java.util.Scanner;

public class SumWithString {

	public static void main(String[] args)
	{
		Scanner scn = new Scanner(System.in);
		System.out.println(" Enter a number");
		int n = scn.nextInt();
		String s = " ";
		long product = 1;
		for( int i = 1; i<= n; i++)
		{
			product = product * i;
			s = s + i;
			if (i != n)
				s = s+ "*";
		}
		System.out.println( s + " = " + product);
		

	}

}
