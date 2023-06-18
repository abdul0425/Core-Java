package edu.jspider.Sep12;

public class FirstAndLastOccurence {

	
	static void occurence(int[]a,int search)
	{
		int count=0; int lastIndex=0;
		for(int i=0;i<a.length;i++)
		{
			if(search==a[i])
			{
				count++;
				if(count==1)
					System.out.println("First Occurence  :  "+i);
				else
					lastIndex=i;
			}
		}
		System.out.println("Last Occurence  :  "+lastIndex);
	}
	
	public static void main(String[] args) {
		int[] a= {2,3,5,5,5,5,5,5,5,8,7,9};
		int search=5;
		occurence(a,search);
	}

}
