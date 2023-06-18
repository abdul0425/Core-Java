package print.java; import java.util.Scanner;

public class LeastCommonMultiplier {

	public static void main(String[] args)
	{
		System.out.println(" Enter two numbers Sir :");
		int number1 = new Scanner(System.in).nextInt();
		int number2 = new Scanner(System.in).nextInt();
		int i ;
		int greaterNumber = number1>number2? number1: number2;
		
		for (i = greaterNumber; i<= (number1*number2) ; i += greaterNumber)
			if ( i%number1 == 0 && i%number2 == 0)
			{
			System.out.println(" LCM : " + i);
			break;
			}
	}

}
