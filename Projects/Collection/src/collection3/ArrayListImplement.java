package collection3;

public class ArrayListImplement {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add("Arshad Alam");
		a.add("Noorii Alam");
		a.add("Raja Alam");
		
		a.add(2,"Mehmed Arsalan");
		a.remove(3);
		
		for(int i=0;i<a.size();i++)
		{
			String name=(String)a.get(i);
			System.out.println("Family Name  :  "+name);
		}
	}
}
