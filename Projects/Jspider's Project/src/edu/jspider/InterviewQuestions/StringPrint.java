package edu.jspider.InterviewQuestions;

public class StringPrint {
	
	static int  count=0;
	public static void printString()
	{
		System.out.println("java");
		count++;
		if(count!=5)
			printString();
		
	}
	public static void main(String[] args) {
		
		printString();
	}

}
