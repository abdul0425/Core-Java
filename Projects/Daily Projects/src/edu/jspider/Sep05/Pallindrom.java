package edu.jspider.Sep05;

public class Pallindrom {

	static boolean isPallindrom(String s)
	{
		int i=0;int j=s.length()-1;
		while(i<j)
		{
			if(s.charAt(i)!=s.charAt(j))return false;
			i++;
			j--;
		}
		return true;
	}
	
	public static void main(String[] args) {
		String s="malayalam";
		System.out.println(isPallindrom(s));
	}

}
