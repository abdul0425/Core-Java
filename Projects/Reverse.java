class Reverse
{
	public static void main(String[] args)
	{
		int number = 12345;
		String s = " ";
		
		int digit;
		while(number>0)
		{
			digit = number%10;
			s = s + digit;
			number = number/10;
			
		}
		System.out.println(s);
	}
}