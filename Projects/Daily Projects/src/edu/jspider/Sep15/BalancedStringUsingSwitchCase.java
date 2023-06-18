package edu.jspider.Sep15;

import java.util.Scanner;
import java.util.Stack;

public class BalancedStringUsingSwitchCase {

	static boolean isBalanced(String s)
	{
		Stack<Character> st=new Stack<Character>();
		for(int i=0;i<s.length();i++)
		{
			char c=s.charAt(i);
			if(c=='['||c=='{'||c=='(')
				st.push(c);
			else if(c==']'||c=='}'||c==')')
			{
				if(st.isEmpty())return false;
				switch(c)
				{
				case ']' :
				{
					if(st.pop()!='[')return false;
					break;
				}
				case '}' :
				{
					if(st.pop()!='{')return false;
					break;
				}
				case ')' :
				{
					if(st.pop()!='(')return false;
					break;
				}
				}
			}
		}
		return st.isEmpty();
	}
	
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		System.out.println("Enter String");
		String s=obj.nextLine();
		
		//String s="[{()}][]{}()";
		System.out.println(isBalanced(s));
	}

}
