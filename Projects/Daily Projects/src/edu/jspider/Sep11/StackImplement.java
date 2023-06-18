package edu.jspider.Sep11;

public class StackImplement {

	public static void main(String[] args) {
		Stack st=new Stack();
		st.push(10);
		st.push(20);
		st.push(30);
		st.push(40);
		st.push(50);
		
		
		System.out.println("Stack Size    :  "+st.size());
		System.out.print("Stack Element's  :  ");
		int size=st.size();
		for(int i=0;i<size;i++)
			System.out.print(st.pop()+" ");
		
		System.out.println(st.isEmpty());
	}

}
