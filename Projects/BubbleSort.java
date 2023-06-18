class BubbleSort
{
	public static void main(String[] args)
	{
		int[] array = {36,19,29,12,5};
		int temp;
		for (int i=0; i<array.length; i++)
		{
			for(int j=0; j<array.length-1; j++)
			{
				//Swapping the value
				if (array[j]>array[j+1])
				{
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		//Printing the value of Sorted  Array :
		for (int i=0; i<array.length; i++)
		{
			System.out.print(array[i]+ " ");
		}
		
	}
}