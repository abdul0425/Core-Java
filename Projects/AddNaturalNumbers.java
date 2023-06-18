package print.java; import java.util.Scanner;

public class AddNaturalNumbers {

	public static void main(String[] args)
	{
		System.out.println(" Enter a number :");
		int number = new Scanner(System.in).nextInt();
		int i; int sum = 0;
		for ( i = 1; i <= number ; i++)
		{
			sum = sum + i;
		}
		System.out.println(" Sum is =" + sum);
		

	}

}
