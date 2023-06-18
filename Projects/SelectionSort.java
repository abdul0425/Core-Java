import java.util.Scanner;
class SelectionSort
{
	public static void main(String[] args)
	{
		System.out.println("Enter the size");
		int arraySize=new Scanner(System.in).nextInt();
		int[] array=new int[arraySize];
		int i;
		
		for(i=0; i<array.length; i++)
		{
			System.out.println("Enter Input : ");
			array[i]=new Scanner(System.in).nextInt();
		}
		System.out.print("Array Input : ");
		for(i=0; i<array.length; i++)
		{
			System.out.print(array[i] + " ");
		}
		
		int min; int temp=0;
		for(i=0; i<array.length; i++)
		{
			min = i;
			for(int j=i+1; j<array.length; j++)
			{
				if(array[j]<array[min])
				{
					min = j;
				}
			}
			temp = array[min];
			array[min] = array[i];
			array[i] = temp;
			
		}
		System.out.println();
		System.out.print("Sorted Array : ");
		for(i=0; i<array.length; i++)
			System.out.print(array[i] + " ");
	}
}