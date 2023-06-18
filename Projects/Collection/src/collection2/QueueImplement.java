package collection2;

public class QueueImplement {

	public static void main(String[] args) {
		Queue a=new Queue();
		a.add("Arshad Alam");
		a.add("Rivu Naskar");
		a.add("Akhil Pandu");
		
		int size=a.size();
		for(int i=0;i<size;i++)
		{
			String name=(String)a.poll();
			System.out.println("Names  :  "+name);
		}
				
	}
}
