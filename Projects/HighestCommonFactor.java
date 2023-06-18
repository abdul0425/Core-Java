package print.java; import java.util.Scanner;

class HighestCommonFactor {

	public static void main(String[] args) 
	{
		System.out.println(" Enter two number  Sir : ");
		int number1 = new Scanner(System.in).nextInt();
		int number2 = new Scanner(System.in).nextInt();
		int i ;
		int number = number1>number2?number1:number2;
		int hcf = 0;
		for ( i = 1; i<= number; i++)
		{
			if ( number1%i == 0 && number2%i == 0)
			{
				hcf = i;
			}
		}
		
		System.out.println(" The HCF for the given numbers : " + hcf);

	}
}
