package print.java; import java.util.Scanner;

public class ReverseNumber
{

	public static void main(String[] args) 
	{
		System.out.println(" Enter a Number " );
		Scanner obj = new Scanner(System.in);
		int number = obj.nextInt();
		String s = " ";
		
		while ( number> 0)
		{
			int digit = number%10;
			s = s + digit;
			number = number/10;
		}
		System.out.println(" Revese Number is  : " + s);
		

	}

}
