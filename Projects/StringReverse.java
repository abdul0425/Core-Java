class StringReverse
{
	public static void main(String[] args)
	{
		String name = "Arshad";
		int length = name.length();
		String reverse = " ";
		System.out.println(length);
		for(int i=length-1; i>=0; i--)
		{
			reverse = reverse + name.charAt(i);
		}
		System.out.println(reverse);
	}
}