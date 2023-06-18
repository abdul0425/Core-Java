package edu.jspider.Recursion;

public class ReverseStringUsingRecursion {

	static int length=s.length()-1;
	static void reverse(String s,String rev)
	{
		if(s.length()==0)return;
		
		rev=rev+s.charAt(length)+" ";
		length--;
		reverse(s,rev);
	}
	
	public static void main(String[] args) {
		String s="12345";
		String rev=" ";
		reverse(s,rev);
		System.out.println("Reverse String : "+rev);
	}
}
