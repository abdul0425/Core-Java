package print.java; import java.util.Scanner;

public class DecimalToBinary2sCompliment
{

	public static void main(String[] args) 
	{
		System.out.println(" Enter a Number " );
		Scanner obj = new Scanner(System.in);
		int number = obj.nextInt();
		int reminder; int binary= 0; int i =1;
		int temp = number;
		
		// Decimal to Binary Conversion
		while ( number>0 )
		{
			reminder = number%2;
			binary = binary + (reminder*i);
			number = number/2;
			i = i*10;
			
		}
		System.out.println(binary);
		
		//1's Compliment conversion
		String c1 = "";
		i=1;
		number = temp;
		while( number>0)
		{
			int digit = number%2;
			if ( digit == 0)
				 c1=1+c1;
			else
				c1=0+c1;
			number = number/2;
		}
		System.out.println("1's Compliment : " + c1);
		
		String c2="";
		number = temp;
		int it = 1;
		int c=0;
		while(number>0) {
			int d = number%2;
			d = d==1?0:1;
			
			if(it==1) {
				d=d+1;
				if(d==2) { 
					c=1;
					c2=0+c2;
				}else {
					c=0;
					c2=d+c2;
				}
				it++;
			}else {
				d=c+d;
				if(d==2) { 
					c=1;
					c2=0+c2;
				}else {
					c=0;
					c2=d+c2;
				}
			}
			
			number = number/2;
			
		}
			
		
		// 2's compliment conversion
		//int twoComp = binary;
		
		System.out.println("2's Compliment : " + c2);
		

	}

}
