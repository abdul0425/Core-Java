import java.util.Scanner;

class BubbleSort
{
	public static void main(String[] args)
	{
		System.out.println("Enter the size of Array");
		int arraySize = new Scanner(System.in).nextInt();
		int[] array = new int[arraySize];

		System.out.print("Values : ");
		for(int i=0; i<array.length; i++)
		{
			array[i] = new Scanner(System.in).nextInt();
		}
		System.out.println();
		System.out.print("Enterde Input :");
		for(int j=0; j<array.length; j++)
			System.out.print(array[j]+" ");

		//Sorting the Elements :
		int k; int temp;
		for(k=0; k<array.length; k++)
		{
			for(int l=0; l<array.length-1; l++)
			{
				if(array[l]>array[l+1])
				{
					temp = array[l];
					array[l] = array[l+1];
					array[l+1] = temp;
				}
			}
		}
		System.out.println();
		System.out.print("Sorted Array  :");
		for(k=0; k<array.length; k++)
			System.out.print(array[k]+" ");

	}
}