package collection2;

public class ArrayListImplement {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add("Arshad Alam");
		a.add("Rivu Naskar");
		a.add("Akhil Pandu");
		
		a.add(2, "Sai Pallavi");
		
		a.remove(3);
		
		for(int i=0;i<a.size();i++)
		{
			String name=(String)a.get(i);
			System.out.println("Names  :  "+name);
		}
	}
}
