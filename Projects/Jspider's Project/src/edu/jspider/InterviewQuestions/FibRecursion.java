package edu.jspider.InterviewQuestions;

public class FibRecursion {

	static void fib(int n, int a, int b)
	{
		int c=a+b;
		a=b;
		b=c;
		System.out.print(c+" ");
		n--;
		if(n==0)return;
		fib(n,a,b);
	}
	
	public static void main(String[] args) {
		
		FibRecursion.fib(15, 0, 1);
	}

}
