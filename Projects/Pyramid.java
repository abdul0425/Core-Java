import java.util.Scanner;
class Pyramid
{
	public static void main(String[] args)
	{
		System.out.println("enter a number");
		int number = new Scanner(System.in).nextInt();
		int space = number - 1;
		int star = 1;
		
		for (int i=1; i<=number; i++)
		{
			for(int j=1; j<=space; j++)
			{
				System.out.print(" ");
			}
			for(int k=1; k<=star; k++)
			{
				System.out.print("*");
			}
			System.out.println();
			if( i<=number/2)
			{
				space--;
				star+=2;
			}
			else
			{
				space++;
				star-=2;
			}
		}
	}
}