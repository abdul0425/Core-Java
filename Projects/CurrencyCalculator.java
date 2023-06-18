package print.java; import java.util.Scanner;

public class CurrencyCalculator {

	public static void main(String[] args)
	{
		System.out.println(" Please Enter The Amount Sir : ");
		int n = new Scanner(System.in).nextInt();
		
		if( n%100!=0 )
		{System.out.println(" Transaction FAILED : Please Enter Multiplication of X 100 ");
			return;
		}
		if( n/2000>=0)
		{System.out.println("2000 X " + (n/2000));
			n = n % 2000;
		}
		if( n/500>=0)
		{System.out.println("500  X " + (n/500));
			n = n % 500;
		}
		if( n/200>=0)
		{System.out.println("200  X " + (n/200));
			n = n % 200;
		}
		if( n/100>=0)
		{System.out.println("100  X " + (n/100));
			
		}
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" ");
		System.out.println(" *______________THANKS * VISIT * AGAIN_____________* ");

	}

}
