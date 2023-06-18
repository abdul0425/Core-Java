import java.util.Scanner;

class Factorial
{
	private long i;

	public long getData()
	{
		return this.i;
	}
	public long factorial()
	{
		int fact = 1;
		for(int j=1; j<=i; j++)
		{
			fact = fact*j;
		}
		return fact;
	}
	public void setData(long n)
	{
		this.i = n;
	}
}
class FactImplement
{
	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter a Number");
		long n = obj.nextInt();
		Factorial fact = new Factorial();
		if(n<0)
			System.out.println("-ve number not allowed !");
		else
		{
			fact.setData(n);
			long result = fact.factorial();
			System.out.println("Factorial => "+ result);
		}
		
	}
}