package edu.jspider.FlatMap;

import java.util.List;
import java.util.stream.Collectors;

public class FlatMapDemo2 {

	public static void main(String[] args) {
		List<String> list1=List.of("a","f","g","y");
		List<String> list2=List.of("g","d","n","x");
		List<String> list3=List.of("x","e","h","j");
		List<String> list4=List.of("g","j","r","s");
		
		
		List<List<String>> listOfString=List.of(list1,list2,list3,list4);
		List<String> finalList=listOfString.stream().flatMap(list->list.stream())
		.collect(Collectors.toList());
		
		System.out.println("Final List : "+finalList);
	}
}
