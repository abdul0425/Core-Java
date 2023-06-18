package edu.jspider.String;

import java.util.Stack;

public class BalancedString {

	static boolean pair(char c1, char c2)
	{
		if(c1=='[' && c2==']')return true;
		if(c1=='{' && c2=='}')return true;
		if(c1=='(' && c2==')')return true;
		
		return false;
	}
	
	public static boolean isBalanced(String s)
	{
		Stack<Character> st = new Stack<Character>();
		for(int i=0; i<s.length()-1; i++)
		{
			char c=s.charAt(i);
			if(c=='['||c=='{'||c=='(')
			{
				st.push(c);
			}
			else if(c==']'||c=='}'||c==')')
			{
				if(st.isEmpty())return false;
				if(!pair(st.pop(),c))return false;
			}
		}
		if(st.isEmpty())return true;
		else return false;
	}
	public static void main(String[] args) {
		System.out.println(isBalanced("[{}]"));
	}

}
