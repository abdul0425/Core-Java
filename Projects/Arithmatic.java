package print.java; import java.util.Scanner;

public class Arithmatic {

	public static void main(String[] args)
	{
		System.out.println(" Enter Two Numbers :");
		Scanner s = new Scanner(System.in);
		int n1 = s.nextInt();
		int n2 = s.nextInt();
		
		System.out.println(" Addition is : " + (n1 + n2));
		System.out.println(" Substraction is : " + (n1 - n2));
		System.out.println(" Multiply is : " + (n1 * n2));
		System.out.println(" Devision is : " + (n1 / n2));
		System.out.println(" Modulous is : " + (n1 % n2));
		

	}

}
