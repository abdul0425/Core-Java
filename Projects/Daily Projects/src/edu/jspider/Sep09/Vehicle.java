package edu.jspider.Sep09;

public class Vehicle {
	
	public static void main(String[] args) {
		
		Engine e1=new Engine("1234","BC12","Speed");
		Pulsar p=new Pulsar(20, "Patrol", "220cc", e1);
		YamahaR15 y=new YamahaR15(20,"Patrol","150cc", e1);
		
		System.out.println(p.equals(y));
	}
}
