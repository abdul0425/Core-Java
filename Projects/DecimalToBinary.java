import java.util.Scanner;
class DecimalToBinary
{
	public static void main(String[] args)
	{
		System.out.println("Enter a number");
		int number=new Scanner(System.in).nextInt();
		int binary=0; int i=1; int temp=number;
		
		while(number>0)
		{
			int bit=number%2;
			binary=binary+(i*bit);
			number=number/2;
			i=i*10;
		}
		number=temp;
		System.out.println("Binary Value for : "+ number + " : " + binary);
	}
}