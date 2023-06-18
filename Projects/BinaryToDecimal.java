import java.util.Scanner;
class BinaryToDecimal
{
	public static void main(String[] args)
	{
		System.out.println("Enter a number");
		int number=new Scanner(System.in).nextInt();
		int decimal=0; int i=1; int temp=number;
		
		while(number>0)
		{
			int bit=number%10;
			decimal=decimal+(i*bit);
			number=number/10;
			i=i*2;
		}
		number=temp;
		System.out.println("Decimal Value for : "+ number + " : " + decimal);
	}
}