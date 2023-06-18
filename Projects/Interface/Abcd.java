import java.util.Scanner;

class StringName
{
	
	static void method(int count)
	{
		if(count-->0)
		{
			System.out.println(count);
			System.out.println("Bengaluru : ");
			StringName.method(count);
		}
	}

	public static void main(String[] args)
	{
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the count");
		int count = obj.nextInt();
		StringName.method(count);
	}
}