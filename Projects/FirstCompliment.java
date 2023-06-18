import java.util.Scanner;

class FirstCompliment
{
	public static void main(String[] args)
	{
		System.out.println("Enter a number");
		int num = new Scanner(System.in).nextInt();
		int once = 0; int i = 1; int temp = num;
		
		System.out.println("Input Number :"+num);
		while(num>0)
		{
			int bit = num%2;
			if(bit == 0)
				bit = 1;
			else
				bit = 0;
			once = once + (i*bit);
			num = num/2;
			i = i*10;
		}
		System.out.println("i's Compliment for :"+temp+ " : is "+ once);
	}
}