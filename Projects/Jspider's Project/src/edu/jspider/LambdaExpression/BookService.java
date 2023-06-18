package edu.jspider.LambdaExpression;

import java.util.Collections;
import java.util.List;

public class BookService {

	public static List<Book> booksInSortedOrder(List<Book> list)
	{
		Collections.sort(list);
		return list;
	}
	public static void main(String[] args) {
		List<Book> order = booksInSortedOrder(BookDAO.bookList());
		for(Book b:order)
			System.out.println(b);
	}
}
