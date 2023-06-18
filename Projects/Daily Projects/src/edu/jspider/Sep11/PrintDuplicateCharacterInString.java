package edu.jspider.Sep11;

public class PrintDuplicateCharacterInString {

	static void duplicateCharacter(String s)
	{
		s=s.toLowerCase();
		while(s.length()>0)
		{
			char c=s.charAt(0);
			if(c!=' ')
			{
				String s1=s.replace(c+"", "");
				int count=s.length()-s1.length();
				if(count>1)
					System.out.println(c+"  =  "+count);
				s=s1;
			}
			else
			{
				s=s.replace(c+"", "");
			}
		}
	}
	
	public static void main(String[] args) {
		String s="My name is Guarav Kukade!";
		duplicateCharacter(s);
	}

}
