package collection6;

public class ArrayListImplement {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add(50);
		l.add(60);
		l.add(70);
		l.add(80);
		
		l.add(100, 2);
		
		for(int i=0;i<l.size();i++)
		{
			int num=(Integer)l.get(i);
			System.out.println(num);
		}
		
		l.remove(0);
		for(int i=0;i<l.size();i++)
		{
			int num=(Integer)l.get(i);
			System.out.println(num);
		}
	}
}
