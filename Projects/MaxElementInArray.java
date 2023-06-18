import java.util.Scanner;

class MaxElementInArray
{
	public static void main(String[] args)
	{
		System.out.println("enter the size");
		int arraySize = new Scanner(System.in).nextInt();
		int[] array = new int[arraySize];
		for(int i=0; i<arraySize; i++)
		{
			System.out.println("enter values");
			array[i] = new Scanner(System.in).nextInt();
		}
		System.out.println();
		for(int k=0; k<arraySize; k++)
		{
			System.out.print( array[k]+" ");
		}
		System.out.println();
		int maxValue = array[0];
		for(int l=1; l<arraySize; l++)
		{
			if(maxValue<array[l])
			{
				maxValue = array[l];
			}
		}
		System.out.println("Max value in Array : " + maxValue);
		
	}
}