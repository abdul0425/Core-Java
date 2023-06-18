package print.java;

public class MethodLCM 
{

	public static void main(String[] args) 
	{
		int lcm = MethodLCM.lcm(18,24);
		System.out.println("Value of lcm : " + lcm);
		lcm = MethodLCM.lcm(24,36);
		System.out.println("Value of lcm : " + lcm);
		 lcm = MethodLCM.lcm(12,24);
		System.out.println("Value of lcm : " + lcm);
		
		
	}
	
	static int lcm( int a, int b)
	{
		int number = a>b?a:b;
		while ( true )
		{
			if ( number%a==0 && number%b==0)
			{
				break;
			}
			number++;
		}
		return number;
	}

}
