package edu.jspider.July15;

public class MissingNoInArray {

	public static void main(String[] args) {
		int n=10;
		int[]a= {1,2,3,4,5,7,8,9,10};
		int sum=0;
		for(int i=0;i<a.length;i++)
			sum+=a[i];
		int actualSum=n*(n+1)/2;
		int missingNum=actualSum-sum;
		System.out.println("Missing num in natural Number of Array  :  "+missingNum);;
	}
}
