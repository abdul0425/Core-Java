package edu.jspider.InterviewQuestions;

public class RevRecursion {

	public static void reverse(int n)
	{
		int rev=0;
		int digit=n%(int)Math.pow(10, 1);
		rev=rev*10+digit;
		n/=10;
		System.out.print(rev);
		if(n==0)return;
		
		reverse(n);
	}
	public static void main(String[] args) {
		
		RevRecursion.reverse(5124);
		
	}

}
