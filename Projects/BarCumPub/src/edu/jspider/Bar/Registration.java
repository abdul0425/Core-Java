package edu.jspider.Bar;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Registration {

	public static void main(String[] args) {
		List<Customer> list1=new ArrayList();
		list1.add(new Customer("Rivu Naskar", 256482, "1565482658", 45));
		list1.add(new Customer("Akhil Pandu", 534862, "1565481546", 47));
		list1.add(new Customer("Vanitha Kumari", 153785, "1565487591", 30));
		list1.add(new Customer("Pawan Reddy", 256153, "1565484301", 45));
		list1.add(new Customer("Balu Krishna", 251538, "5672482658", 20));
		list1.add(new Customer("Raj Naskar", 256481, "1565433658", 18));
		list1.add(new Customer("Akshay Pandu", 534662, "1567581546", 25));
		list1.add(new Customer("Vani Kumari", 153735, "1565367591", 30));
		list1.add(new Customer("Pakka Reddy", 256173, "1565464301", 15));
		list1.add(new Customer("Bangar Krishna", 221538, "5322482658", 12));
		
		
		Predicate<Customer> p=age->age.getCustomerAge()>=21;
		List<Customer> list2=list1.stream().filter(p).collect(Collectors.toList());
		list2.forEach(n->System.out.println(n));
	}
}
