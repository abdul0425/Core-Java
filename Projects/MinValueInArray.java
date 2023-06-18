import java.util.Scanner;

class MinValueInArray
{
	public static void main(String[] args)
	{
		System.out.println("enter the size");
		int arraySize = new Scanner(System.in).nextInt();
		int[] array = new int[arraySize]; 
		int i;
		
		for( i=0; i<arraySize; i++)
		{
			System.out.println("Enter value");
			array[i] = new Scanner(System.in).nextInt();
			
		}
		System.out.println();
		for( i=0; i<arraySize; i++)
		{
			System.out.print(array[i] + " ");
		}
		int minValue = array[0];
		for(int l=1; l<arraySize; l++)
		{
			if(array[l]<minValue)
			{
				minValue=array[l];
			}
		}
		System.out.println();
		System.out.println("Min Value : " + minValue);	
	}
}