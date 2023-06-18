package edu.jspider.String;

public class CharAtIndexMethod {

	public static void main(String[] args) {
		String s1 = "Bengaluru";
		int len = s1.length();
		
		for(int i=0; i<len; i++)
		{
			System.out.print(i +" :"+s1.charAt(i)+" ");
		}
	}

}
