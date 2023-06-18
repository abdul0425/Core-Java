package edu.jspider.LambdaExpression;



public class Book implements Comparable<Book>{

	int bookId;
	String bookName;
	int bookPages;
	public Book(int bookId, String bookName, int bookPages) {
		this.bookId = bookId;
		this.bookName = bookName;
		this.bookPages = bookPages;
	}
	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getBookName() {
		return bookName;
	}
	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	public int getBookPages() {
		return bookPages;
	}
	public void setBookPages(int bookPages) {
		this.bookPages = bookPages;
	}
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + ", bookPages=" + bookPages + "]";
	}
	@Override
	public int compareTo(Book b)
	{
		return bookName.compareTo(b.bookName);
	}
}
