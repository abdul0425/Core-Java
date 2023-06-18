package edu.jspider.Comparable;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
public class NikhatManzil {

	public static void main(String[] args) {
		List<Family> l=new ArrayList<>();
		l.add(new Family("Basarat Ali Ansari", 60, "Male"));
		l.add(new Family("Nikhat Perween", 50, "Female"));
		l.add(new Family("Abdul Majid Alam", 30, "Male"));
		l.add(new Family("Noorii Alam", 25, "Female"));
		l.add(new Family("Fatma Praween", 29, "Female"));
		l.add(new Family("Abdul Shaffique Alam", 28, "Male"));
		l.add(new Family("Sara Hayat", 7, "Female"));
		l.add(new Family("Mehmed Arsalan", 1, "Male"));
		
		Collections.sort(l);
		for(Family n:l)
			System.out.println(n);
	}
	
}
