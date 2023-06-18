import java.util.Scanner;
class AutomorphicNumber
{
	public static void main(String[] args)
	{
		System.out.println("Enter a number");
		int number=new Scanner(System.in).nextInt();
		int count=0; int temp=number; 
		
		while(number>0)
		{
			count++;
			number=number/10;
		}
		number = temp;
		System.out.println("Count : "+count);
		int square = number*number;
		System.out.println("Square : "+square);
		
		while(number>0 && square>0)
		{
			if(number%10 == square%10)
				{
					number=number/10;
					square=square/10;
				}
			else
			{
				System.out.println("Not AutomorphicNumber");
				break;
			}
		}
		if(number==0)
			System.out.println(temp + ": AutomorphicNumber ");
		
	}
}