package print.java;

public class keywordBreak
{

	public static void main(String[] args) 
	{ int i;
		for (  i = 1; i<= 10; i++)
			if( i%3 == 0)break;
				{	
					System.out.println(i);
				}
		System.out.println(" outside a for loop ");
	}

}
