package edu.jspider.PrivateConstructer;

public class SingletonImplement {

	public static void main(String[] args) {
		Singleton s1=Singleton.getObject();
		Singleton s2=Singleton.getObject();
		Singleton s3=Singleton.getObject();
		
		System.out.println(s1.countObject());
	}

}
