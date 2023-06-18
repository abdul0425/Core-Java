class ReverseString
{
	public static void main(String[] args)
	{
		int number = 12345;
		String s1 = " ";
		
		
		while(number>0)
		{
			int digit;
			digit = number%10;
			s1 = s1+digit;
			number = number/10;
			
		}
		System.out.println("Reverse number : " + s1);
		
		
	}
}