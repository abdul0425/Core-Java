import java.util.Scanner;

class Pallindrome
{
	public static void main(String[] args)
	{
		
		System.out.println("Enter a String");
		Scanner s = new Scanner(System.in);
		String s1 = s.nextLine(); 
		String s2 = "";
		
		int len = s1.length();
		for(int i=len-1; i>=0; i--)
		{
			s2 = s2 + s1.charAt(i);
		}
		System.out.println("Input String : "+ s1);
		System.out.println("Reverse String : "+ s2);
		
		if(s1.equals(s2))
			System.out.println("String is Pallindrom");
		else
			System.out.println("Not Pallindrom");
	}
}