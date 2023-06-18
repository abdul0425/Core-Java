package edu.jspider.Stack;

public class StackImplement {

	public static void main(String[] args) {
		Stack s=new Stack();
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(40);
		s.add(50);
		
		System.out.println(s.peek());
		System.out.println(s.isEmpty());
		int size=s.size();
		for(int i=0;i<size;i++)
		{
			int num=(Integer)s.get();
			System.out.println(num);
		}
		System.out.println(s.peek());
		System.out.println(s.isEmpty());
	}
}
