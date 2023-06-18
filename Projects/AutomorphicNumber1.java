import java.util.Scanner;

class AutomorphicNumber1
{
	public static void main(String[] args)
	{
		System.out.println("Enter a number");
		int num = new Scanner(System.in).nextInt();
		int square = num*num; int temp = num;
		System.out.println("Square Root :"+square);
		
		while(num>0 && square>0)
		{
			if(num%10 != square%10)
			{
				break;
			}
			num = num/10;
			square = square/10;
		}
		if(num == 0)
			System.out.println(temp +" : is an Automorphic Number");
		else
			System.out.println(temp +" : Not Automorphic Number");
		
	}
}