package edu.jspider.FlatMap;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FlatMapDemo1 {

	public static void main(String[] args) {
		List<Integer> list1=List.of(2,3,5);
		List<Integer> list2=List.of(7,11,13);
		List<Integer> list3=List.of(17,19,23);
		
		List<List<Integer>> finalList=List.of(list1,list2,list3);
		List<Integer> l = finalList.stream().flatMap(list->list.stream())
		.collect(Collectors.toList());
		
		System.out.println("List  :  "+l);
	}

}
