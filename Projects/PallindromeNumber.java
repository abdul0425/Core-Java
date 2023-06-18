import java.util.Scanner;

class PallindromeNumber
{
	public static void main(String[] args)
	{
		System.out.println("Enter a Number");
		int num = new Scanner(System.in).nextInt();
		int temp = num; int digit; int sum = 0;
		
		System.out.println("Input Number : "+num);
		while(num>0)
		{
			digit = num%10;
			sum = (sum*10)+digit;
			num = num/10;
		}
		System.out.println("Reverse Number : "+ sum);
		
		if(temp == sum)
			System.out.println(temp+" : is Pallindrome Number");
		else
			System.out.println(temp+" : is not Pallindrome Number");
	}
}