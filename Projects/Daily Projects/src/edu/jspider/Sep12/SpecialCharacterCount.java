package edu.jspider.Sep12;

public class SpecialCharacterCount {

	
	static void specialCharacter(String s)
	{
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if((c>='0' && c<='9' ||  c==' ' || c>='a' && c<='z'))
				continue;
			else
			{
				count++;
				System.out.println(c);
			}
		}
		System.out.println("Special character count  :  "+count);
	}
	
	
	public static void main(String[] args) {
		String s="my name is ab@@*du)l m#j!id $al%am^";
		specialCharacter(s);
	}

}
