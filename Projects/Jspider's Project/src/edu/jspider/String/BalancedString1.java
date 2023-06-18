package edu.jspider.String;

import java.util.Stack;

public class BalancedString1 {

	public static boolean pair(char c1, char c2) {
		if (c1 == '[' && c2 == ']') {
			return true;
		}
		if (c1 == '{' && c2 == '}') {
			return true;
		}
		if (c1 == '(' && c2 == ')') {
			return true;
		}

		return false;
	}

	public static boolean isBalanced(String s) {
		Stack<Character> stack = new Stack<Character>();
		for (int i = 0; i < s.length() - 1; i++) {
			char c = s.charAt(i);
			if (c == '[' || c == '{' || c == '(') {
				stack.push(c);
			} else if (c == ']' || c == '}' || c == ')') {
				if (stack.isEmpty())
					return false;
				char c1 = stack.pop();
				//boolean result = pair(c1, c);
				//if (result)
					//return true;
				if(pair(stack.pop(), c)) return false;
			}
		}
		if(stack.isEmpty())return true;
		else return false;
	}

	public static void main(String[] args) {
		System.out.println(isBalanced("[{}]{}"));
	}

}
