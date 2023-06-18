package edu.jspider.LambdaExpression;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {

	public static List<Book> bookList()
	{
		List<Book> bookList=new ArrayList<>();
		bookList.add(new Book(106, "Java", 254));
		bookList.add(new Book(105, "Hibernate", 231));
		bookList.add(new Book(104, "Spring", 225));
		bookList.add(new Book(103, "Spring Boot", 315));
		bookList.add(new Book(102, "MicroService", 354));
		bookList.add(new Book(101, "SpringMVC", 190));
		return bookList;
	}
}
