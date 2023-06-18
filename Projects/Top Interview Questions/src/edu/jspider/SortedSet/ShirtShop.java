package edu.jspider.SortedSet;
import java.util.Set;
import java.util.HashSet;
public class ShirtShop {

	public static void main(String[] args) {
		Set<Shirt> s=new HashSet<>();
		s.add(new Shirt("White", 40, 1199));
		s.add(new Shirt("Black", 42, 1299));
		s.add(new Shirt("Maroon", 40, 799));
		s.add(new Shirt("Gray", 42, 899));
		s.add(new Shirt("White", 40, 1199));
		s.add(new Shirt("Black", 42, 1299));
		
		for(Shirt n:s)
			System.out.println(n);
	}
}
