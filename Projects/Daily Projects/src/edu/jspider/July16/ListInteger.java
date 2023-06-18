package edu.jspider.July16;
import java.util.List;
import java.util.ArrayList;
public class ListInteger {

	public static void main(String[] args) {
		List<Integer> l=new ArrayList<Integer>();
		
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		l.add(60);
		
		List l2=new ArrayList();
		for(int i=0;i<l.size();i++)
		{
			int num=l.get(i);
			if(num%2==0)
			{
				l2.add(num);
			}
		}
		for(Object a:l2)
			System.out.println(a);
			
	}
}
