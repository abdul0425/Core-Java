import java.util.Scanner;

class GreatestNumber
{
	public static void main(String[] args)
	{
		System.out.println("Enter How many numbers you want to check :");
		int size = new Scanner(System.in).nextInt();
		int[] array = new int[size]; int i; int j;
		
		for( i=0; i<size; i++)
		{
			System.out.println("Values ? :");
			array[i] = new Scanner(System.in).nextInt();
		}
		System.out.println();
		System.out.print("Input Numbers : ");
		for( j=0; j<size; j++)
		{
			System.out.print(array[j]+" ");
		}
		
		int GNum = array[0]; int temp;
		for(i=1; i<size; i++)
		{
			if(GNum<array[i])
			{
				GNum = array[i];
			}
		}
		System.out.println();
		System.out.println("Greatest Number : "+ GNum);
	}
}