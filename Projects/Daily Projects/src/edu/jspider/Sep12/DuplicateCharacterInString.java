package edu.jspider.Sep12;

public class DuplicateCharacterInString {

	static void charCount(String s)
	{
		while(s.length()>0)
		{
			char c=s.charAt(0);
			String s1=s.replace(c+"", "");
			int count=s.length()-s1.length();
			if(c!=' ')
			{
				if(count>1)
					System.out.println(c+"  :  "+count);
			}
			s=s1;
		}
	}
	
	public static void main(String[] args) {
		String s="my name is abdul majid alam";
		charCount(s);
	}

}
