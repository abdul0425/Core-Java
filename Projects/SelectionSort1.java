class SelectionSort1
{
	public static void main(String[] args)
	{
		int[] array = {10,5,9,3,7,2,6};
		int len = array.length;
		int min; int temp;
		System.out.print("Input Array : ");
		for(int k=0; k<len; k++)
		{
			System.out.print(array[k]+" ");
		}
		
		for(int i=0; i<len; i++)
		{
			min = i;
			for( int j=i+1; j<len; j++)
			{
				if(array[j]<array[min])
				{
					min=j;
				}
			}
			temp = array[min];
			array[min] = array[i];
			array[i] = temp;
		}
		System.out.println();
		
		System.out.println();
		System.out.print("Sorted Array : ");
		for(int l=0; l<len; l++)
		{
			System.out.print(array[l]+" ");
		}
		
		
	}
}