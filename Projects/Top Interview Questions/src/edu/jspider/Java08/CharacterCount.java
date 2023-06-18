package edu.jspider.Java08;
import java.util.Map;
import java.util.HashMap;
public class CharacterCount {

	static void charCount(String s)
	{
		Map m=new HashMap();
		char[] a=s.toCharArray();
		for(char temp:a)
		{
			if(m.get(temp)!=null)
			{
				int v=(int) m.get(temp);
				m.put(temp, v+1);
			}
			else
			{
				m.put(temp, 1);
			}
		}
		System.out.println(m);
	}
	public static void main(String[] args) {
		charCount("banana");
	}
}
