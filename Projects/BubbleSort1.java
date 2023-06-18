class BubbleSort1
{
	public static void main(String[] args)
	{
		int[] array = {38,52,9,18,6,62,13};
		int i; int temp=0;
		System.out.print("input Array : ");
		System.out.println();
		
		for(i=0; i<array.length; i++)
		{
			System.out.print(array[i]+ " ");
		}
		System.out.println();
		
		for(i=0; i<array.length-1; i++)
		{
			for(int j=0; j<array.length-1; j++)
			{
				if(array[j]>array[j+1])
				{
					temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		System.out.println();
		System.out.print("Sorted Array : ");
		for(i=0; i<array.length; i++)
			System.out.print(array[i]+ " ");
	}
}