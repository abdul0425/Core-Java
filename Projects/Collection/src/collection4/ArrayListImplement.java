package collection4;

public class ArrayListImplement {

	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		l.add(10);
		l.add(20);
		l.add(30);
		l.add(40);
		l.add(50);
		
		l.add(3,10);
		l.remove(5);
		
		for(int i=0;i<l.size();i++)
		{
			int num=(Integer)l.get(i);
			System.out.println("Number's  :  "+num);
		}
	}
}
