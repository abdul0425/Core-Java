package edu.jspider.String;

public class Annagram {
	
	static boolean isAnnagram(String s1, String s2)
	{	
		while(s1.length() == s2.length())
		{
			if(s1.length()==0 && s2.length()==0)return true;
			char c = s1.charAt(0);
			 s1 = s1.replace(c+"","");
			 s2 = s2.replace(c+"","");
		}
		return false;
	}

	public static void main(String[] args) {
		//Annagram Example - (TRIANGLE - INTEGRAL) (KEEP - PEEK) (BRAG - GRAB)
		System.out.println(Annagram.isAnnagram("listen","silent"));
		System.out.println(Annagram.isAnnagram("triangle","integral"));
		System.out.println(Annagram.isAnnagram("keep","peek"));
		System.out.println(Annagram.isAnnagram("listen","abcdef"));
		
	}

}
