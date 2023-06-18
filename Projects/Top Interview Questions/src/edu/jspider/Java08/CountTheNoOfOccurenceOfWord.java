package edu.jspider.Java08;

import java.util.HashMap;
import java.util.Map;

public class CountTheNoOfOccurenceOfWord {

	
	static void countWords(String s)
	{
		Map<String,Integer> m=new HashMap();
		String[] a=s.split(" ");
		for(String temp:a)
		{
			if(m.get(temp)!=null)
			{
				m.put(temp, m.get(temp)+1);
			}
			else
				m.put(temp, 1);
		}
		System.out.println(m);
	}
	
	public static void main(String[] args) {
		String s="welcome to code decode and code decode welcome you";
		countWords(s);
	}
}
