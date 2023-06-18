import java.util.Scanner;
class ArrayDescendingOrder
{
	public static  void main(String[] args)
	{
		System.out.println("enter the size");
		int arraySize = new Scanner(System.in).nextInt();
		int[] array = new int[arraySize];
		int i; 
		
		for( i=0; i<arraySize; i++)
		{
			System.out.println("enter Values : ");
			array[i] = new Scanner(System.in).nextInt();
		}
		System.out.print("Array Input : ");
		for(i=0; i<array.length; i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
		
		for(i=0; i<array.length; i++)
		{
			for(int j=0; j<array.length-1; j++)
			{
				int temp;
				if(array[j]>array[j+1])
				{
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		System.out.print("Sorted Arrray : ");
		for(i=0; i<array.length; i++)
		{
			System.out.print(array[i]+" ");
		}
		System.out.println();
		System.out.print("Array Descending Order : ");
		for(i=array.length-1; i>=0; i--)
		{
			System.out.print(array[i]+" ");
		}
	}
}