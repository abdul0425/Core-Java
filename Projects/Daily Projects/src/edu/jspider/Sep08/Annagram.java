package edu.jspider.Sep08;

public class Annagram {

	static boolean annagram(String s1,String s2)
	{
		while(s1.length()==s2.length())
		{	if(s1.length()==0 && s2.length()==0)return true;
			char c=s1.charAt(0);
			s1=s1.replace(c+"", "");
			s2=s2.replace(c+"", "");
			s1=s2;
		}
		
		return false;
	}
	
	public static void main(String[] args) {
		String s1="silent";
		String s2="listen";
		
		if(annagram(s1,s2))
			System.out.println("Annagram");
		else
			System.out.println("Not Annagram");
	}
}
