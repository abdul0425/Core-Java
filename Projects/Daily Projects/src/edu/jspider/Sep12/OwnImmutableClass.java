package edu.jspider.Sep12;

public final class OwnImmutableClass {

	final int id;
	
	OwnImmutableClass(int id)
	{
		this.id=id;
	}
	
	public OwnImmutableClass change(int id)
	{
		if(id!=this.id)
			return new OwnImmutableClass(id);
		else
			return this;
	}
	
	public static void main(String[] args) {
		OwnImmutableClass i1=new OwnImmutableClass(10);
		OwnImmutableClass i2=i1.change(20);
		System.out.println(i1==i2);
	}

}
