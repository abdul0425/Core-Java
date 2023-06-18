package collection2;
import java.util.Set;
import java.util.HashSet;
public class ShirtImplement {

	public static void main(String[] args) {
		Set<Shirt> st=new HashSet<Shirt>();
		Shirt s1=new Shirt("White", 40, 1299);
		Shirt s2=new Shirt("Black", 40, 1299);
		Shirt s3=new Shirt("Maroon", 40, 1299);
		Shirt s4=new Shirt("Gray", 40, 1299);
		Shirt s5=new Shirt("Black", 40, 1299);
		Shirt s6=new Shirt("White", 40, 1299);
		
		System.out.println(st.add(s1));
		System.out.println(st.add(s2));
		System.out.println(st.add(s3));
		System.out.println(st.add(s4));
		System.out.println(st.add(s5));
		System.out.println(st.add(s6));
		
		for(Shirt shirt:st)
			System.out.println(shirt.toString());
	}
}
