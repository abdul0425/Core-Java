package edu.jspider.String;

public class RevWord {

	public static void main(String[] args) {
		String s1="java is an oop language";
		String[] arr=s1.split(" ");
		
		for(String s:arr)
			System.out.print(s+" ");
		System.out.println();
		int len = arr.length;
		String s2=" ";
		System.out.println(s2);
		for(int i=len-1; i>=0; i--)
		{
			s2=s2+" "+arr[i];
		}
		String s3=s2.trim();
		System.out.println(s3);
	}

}
