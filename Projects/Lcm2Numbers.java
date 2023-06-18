package print.java;import java.util.Scanner;

public class Lcm2Numbers 
{

	public static void main(String[] args) 
	{
		System.out.println(" Enter Two Number : ");
		int number1 = new Scanner(System.in).nextInt();
		int number2 = new Scanner(System.in).nextInt();
		int number = number1>number2?number1:number2;
		System.out.println(" Greater Number : " + number);
		for (int i=number; i<=number1*number2; i+=number)
		{
			if ( i%number1 == 0 && i%number2 == 0)
			{
				System.out.println(" LCM for Two Numbers : " + i);break;
			}
		}
	}

}
