package collection5;

public class ArrayListImplement {

	public static void main(String[] args) {
		ArrayList a=new ArrayList();
		a.add("Arshad");
		a.add("Rivu");
		a.add("Akhil");
		a.add(2,"Sashti");
		a.remove(3);
		
		for(int i=0;i<a.size();i++)
		{
			String name=(String)a.get(i);
			System.out.println("Name : "+name);
		}
	}
}
