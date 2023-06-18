import java.util.Scanner;
class ArrayAscendingOrder
{
	public static void main(String[] args)
	{
		System.out.println("enter the size");
		int arraySize = new Scanner(System.in).nextInt();
		int i;
		int[] array = new int[arraySize];
		for( i=0; i<arraySize; i++)
		{
			System.out.print("enter value"+ " ");
			array[i] = new Scanner(System.in).nextInt();
		}
		System.out.println();
		System.out.print("Array Input List :");
		for( i=0; i<arraySize; i++)
		{
			System.out.print(array[i]+ " ");
		}
		System.out.println();
		
		//compare 2 numbers and swap them.
		
		for(i=0; i<array.length; i++)
		{
			for(int j=0; j<array.length-1; j++)
			{
				int temp;
				if(array[j]>array[j+1])
					{
						temp = array[j];
						array[j] = array[j+1];
						array[j+1]=temp;
					}
			}
		}
		System.out.print("Sorted Array : ");
		for(i=0; i<arraySize; i++)
			System.out.print(array[i]+ " ");
	}
}