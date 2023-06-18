import java.util.Scanner;

class Binary
{
	public static void main(String[] args)
	{
		System.out.println("Enter a number");
		int num = new Scanner(System.in).nextInt();
		int i=1; int bin = 0; 
		System.out.println("Input Number :"+num);
		while(num>0)
		{
			int digit = num%2;
			bin = bin + (i*digit);
			num = num/2;
			i = i*10;
		}
		System.out.println("Binary Number :"+bin);
	}
}