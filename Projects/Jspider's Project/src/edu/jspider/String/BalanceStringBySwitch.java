package edu.jspider.String;

import java.util.Scanner;
import java.util.Stack;

public class BalanceStringBySwitch {

	public static boolean balance(String s)
	{
		Stack<Character> stack=new Stack<Character>();
		for(int i=0; i<s.length(); i++)
		{
			char c=s.charAt(i);
			if(c=='['||c=='{'||c=='(')
				stack.push(c);
			if(c==']'||c=='}'||c==')')
			{
				if(stack.isEmpty())return false;
				switch(c)
				{
				case ']' : 
					if(stack.pop()!='[')return false;
					break;
				case '}' : 
					if(stack.pop()!='{')return false;
					break;
				case ')' : 
					if(stack.pop()!='(')return false;
					break;
				default : break;
				}
			}
		}
		return stack.isEmpty();
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter String");
		String s=sc.nextLine();
		System.out.println(balance(s));
	}

}
