package edu.jspider.July16;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Driver {

	public static void main(String[] args) {
		List<Car> l=new ArrayList<Car>();
		Car c1=new Car("Bently", 301, "Brown");
		Car c2=new Car("Buggati", 601, "Red");
		Car c3=new Car("Audi", 401, "Gray");
		Car c4=new Car("Mustang Gt", 101, "Orange");
		Car c5=new Car("Benz", 201, "Black");
		Car c6=new Car("Chiron", 901, "Brown");
		
		l.add(c1);
		l.add(c2);
		l.add(c3);
		l.add(c4);
		l.add(c5);
		l.add(c6);
		
//		Comparator<Car> com=new Comparator<Car>()
//				{
//					@Override
//					public int compare(Car c1,Car c2)
//					{
//						return c1.carName.compareToIgnoreCase(c2.carName);
//					}
//				};
//			Collections.sort(l, com);
//			System.out.println("Sorted Based On Name  :  ");
//			for(Car n:l)
//				System.out.println(n);
		
		
		// Using Lambda Expression : 
		Collections.sort(l, (a1,a2)->
					{
						return a1.carName.compareToIgnoreCase(a2.carName);
					}
				);
		
		System.out.println("Sorted Based On Name  :  ");
		for(Car n:l)
			System.out.println(n);
	}
	
}
