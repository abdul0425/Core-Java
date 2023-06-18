package edu.jspider.July05;

public class ArrayListImplement {

	public static void main(String[] args) {
		ArrayList list=new ArrayList();
		list.add("1. Java");
		list.add("2. Python");
		list.add("3. JavScript");
		list.add("4. Angular");
		list.add("5. HTML/CSS");
		
		list.add(2, "6. React Js");
		
		for(int i=0;i<list.size();i++)
		{
			String course=(String)list.get(i);
			System.out.println(course);
		}
	}

}
