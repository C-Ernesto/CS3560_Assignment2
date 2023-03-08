
public class Watch {
	private int rating;
	private Person person;
	private Movie movie;
	
	public Watch(int rating, Person person, Movie movie) {
		this.rating = rating;
		this.person = person;
		this.movie = movie;
		
		person.addWatch(this);
		movie.addWatch(this);
	}
	
}
