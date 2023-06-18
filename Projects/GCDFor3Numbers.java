package print.java; import java.util.Scanner;

public class GCDFor3Numbers 
{

	public static void main(String[] args)
	{
		System.out.println(" Enter a number :");
		Scanner obj = new Scanner(System.in);
		int num1 = obj.nextInt();
		int num2 = obj.nextInt();
		int num3 = obj.nextInt();
		
		// calculate greater number : it's optional
		int number = num1>num2?num1:num2;
		number = number>num3?number:num3;
		System.out.println(" Greatest number : " + number);
		
		int GCD=0;
		for ( int i=1; i<=number; i++)
		{
			
			if (num1%i == 0 && num2%i == 0 && num3%i == 0)
			{
				GCD = i;
			}	
		}
		System.out.println(" GCD : " + GCD);
	}

}
