package print.java; import java.util.Scanner;

public class GreaterNumber {

	public static void main(String[] args)
	{
		System.out.println(" Please Enter Two Numbers : ");
		int num1 = new Scanner(System.in).nextInt();
		int num2 = new Scanner(System.in).nextInt();
		
		if ( num1 > num2 )
			System.out.println(" Greater Number is = " + num1);
		else
			System.out.println(" Greater Number is = " + num2);

	}

}
