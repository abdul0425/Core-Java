package edu.jspider.Sep09;

public class Equals {

	public int i;
	public String s;
	
	public Equals(int i,String s)
	{
		this.i=i;
		this.s=s;
		
	}
	
	
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Equals))return false;
		{
			Equals e=((Equals)obj);
			return i==e.i && s.equals(e.s);
		}
	}



	public static void main(String[] args) {
		Equals e1=new Equals(10,"Rivu");
		Equals e2=new Equals(10,"Rivu");
		System.out.println(e1==e2);
		System.out.println(e1.equals(e2));
		
		System.out.println(e1.equals(e2));
	}

}
