package edu.jspider.Sep02;

import java.util.Stack;

public class BalancedString {
	
	public static boolean isPair(char c1,char c2)
	{
		if(c1=='[' && c2==']')return true;
		if(c1=='{' && c2=='}')return true;
		if(c1=='(' && c2==')')return true;
		
		return false;
	}
	
	public static boolean balance(String s)
	{
		Stack<Character> st=new Stack<Character>();
			for(int i=0;i<s.length();i++)
			{
				char c=s.charAt(i);
				if(c=='['||c=='{'||c=='(')
					st.push(c);
				else if(c==')'||c=='}'||c==']')
				{
					if(st.isEmpty())return false;
					//char c1=st.pop();
					if(!isPair(st.pop(),c))return false;
				}
			}
		return st.isEmpty();
	}
	
	public static void main(String[] args) {
		System.out.println(balance("[{()}]{}"));
	}

}
