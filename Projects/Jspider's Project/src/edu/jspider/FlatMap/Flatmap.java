package edu.jspider.FlatMap;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Flatmap {

	public static void main(String[] args) {
		List<Integer> l1=List.of(2,5,6,7,8,9);
		
//		Function<Integer,Integer> f=new Function<>()
//				{
//
//					@Override
//					public Integer apply(Integer t) {
//						return t*t;
//					}
//			
//				};
//			List<Integer> l2=l1.stream().map(f).collect(Collectors.toList());
				List<Integer> l2=l1.stream().flatMap(e->Stream.of(e*e,e+2,e+5,e+7))
						.collect(Collectors.toList());
				System.out.println(l2);
	}
}
