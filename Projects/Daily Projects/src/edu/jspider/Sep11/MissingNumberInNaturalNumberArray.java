package edu.jspider.Sep11;

public class MissingNumberInNaturalNumberArray {

	public static void main(String[] args) {

		// Find the missing number for N natural number's.
		int n=10;
		int[] a = {1, 2, 3, 4, 5, 7, 8, 6, 9 };
		
		int sum=0;
		for(int i=0;i<a.length;i++)
		{
			sum+=a[i];
		}
		int actualSum=(n*(n+1))/2;
		int missingNumber=actualSum-sum;
		System.out.println("The Missing Number is   :  "+missingNumber);
	}

}
