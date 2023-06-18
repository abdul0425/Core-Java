package edu.jspider.Array;

import java.util.Stack;

public class BalanceString {

	public static boolean pair(char c1, char c2)
	{
		if(c1=='['&&c2==']')return true;
		if(c1=='{'&&c2=='}')return true;
		if(c1=='('&&c2==')')return true;
		
		return false;
	}
	
	public static boolean balanced(String s)
	{
		Stack<Character> st=new Stack<Character>();
		for(int i=0; i<s.length(); i++)
		{
			char c=s.charAt(i);
			if(c=='['||c=='{'||c=='(')
				st.push(c);
			else if(c==')'||c=='}'||c==']')
			{
				if(st.isEmpty())return false;
				char bc=st.pop();
				if(!pair(bc,c))return false;
			}
		}
		
		return st.isEmpty();
	}
	public static void main(String[] args) {
		System.out.println(balanced("[](){}"));
	}

}
