import java.util.Scanner;

class Decimal
{
	public static void main(String[] args)
	{
		System.out.println(" Enter a Binary Number");
		int num = new Scanner(System.in).nextInt();
		int dec = 0; int i = 1;
		
		System.out.println("Input Number :"+ num);
		while(num>0)
		{
			int bit = num%10;
			dec = dec + (i*bit);
			num = num/10;
			i = i*2;
		}
		System.out.println("Decimal Number :"+ dec);
	}
}