import java.util.ArrayList;

public class Course {
	private int code;
	private ArrayList<Book> books;
	
	public Course(int newCode) {
		this.code = newCode;
		this.books = new ArrayList<Book>();
	}
	
	public Course(int newCode, ArrayList<Book> book) {
		this.code = newCode;
		this.books = book;
	}
	
	public void addBook(Book book) {
		books.add(book);
	}
}
