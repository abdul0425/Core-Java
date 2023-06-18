package edu.jspider.Sep11;

public class RemoveParticularCharFromString {

	
	static void remove(String s)
	{
		String s1=s.toLowerCase();
		for(int i=0;i<s1.length();i++)
		{
			char c=s1.charAt(i);
			{
				if(c=='c')
				{
					s1=s1.replace(c+"", "");
					System.out.println(s1);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		String s="CloudTech";
		remove(s);
	}

}
