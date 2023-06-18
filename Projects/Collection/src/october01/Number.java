package october01;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
public class Number {

	public static void main(String[] args) {
		List<Integer> l=Arrays.asList(5,10,2,3,9,8,6);
		
		//List<Integer> l1=l.stream().sorted().collect(Collectors.toList());
		//System.out.println(l);
		//System.out.println(l1);
		Integer min=l.stream().min((a,b)->a.compareTo(b)).get();
		System.out.println("Min value : "+min);
		Integer max=l.stream().max((a,b)->a.compareTo(b)).get();
		System.out.println("Max value : "+max);
	}
}
