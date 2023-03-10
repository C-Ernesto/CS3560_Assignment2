import java.util.ArrayList;

public class Book {
	private String name;
	private String author;
	private ArrayList<Course> course;
	
	public Book() {
		this.name = null;
		this.author = null;
		this.course= new ArrayList<Course>(1);
	}
}
