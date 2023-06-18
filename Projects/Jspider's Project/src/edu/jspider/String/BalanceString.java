package edu.jspider.String;
import java.util.Scanner;
import java.util.Stack;
public class BalanceString {

	public static boolean isPair(char c1, char c2)
	{
		if(c1=='[' && c2==']')return true;
		if(c1=='{' && c2=='}')return true;
		if(c1=='(' && c2==')')return true;
		
		return false;
	}
	public static boolean isBalanced(String s)
	{
		Stack<Character> stack=new Stack<Character>();
		for(int i=0; i<s.length(); i++)
		{
			char c=s.charAt(i);
			if(c=='['||c=='{'||c=='(')
				stack.push(c);
			else if(c==']'||c=='}'||c==')')
			{
				if(stack.isEmpty() || !isPair(stack.pop(),c))return false;
			}
		}
		return stack.isEmpty();
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a String ?");
		String s1=sc.nextLine();
		System.out.println(isBalanced(s1));
	}

}
