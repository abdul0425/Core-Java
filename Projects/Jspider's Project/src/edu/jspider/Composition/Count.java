package edu.jspider.Composition;

public class Count {

	static void count(String s)
	{
		while(s.length()>0)
		{
			char c=s.charAt(0);
			String s1=s.replace(c+"", "");
			int count=s.length()-s1.length();
			System.out.println(c+" "+count);
			s=s1;
		}
	}
	
	public static void main(String[] args) {
		String s="banana";
		count(s);
	}

}
