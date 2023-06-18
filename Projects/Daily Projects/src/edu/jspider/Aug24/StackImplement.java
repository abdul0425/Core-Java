package edu.jspider.Aug24;

public class StackImplement {

	public static void main(String[] args) {
		Stack st=new Stack();
		st.push("Allu Arjun");
		st.push("Ram Charan");
		st.push("Jr NTR");
		st.push("Ravi Teja");
		st.push("Arun Vijay");
		
		System.out.println("First Actor in Stack  :  "+st.peek());
		System.out.println("===================================");
		int size=st.size();
		for(int i=0;i<size;i++)
			System.out.println("Actor's Name  :  "+st.pop());
	}
}
