import java.util.ArrayList;

public class Movie {
	private String name;
	private String genre;
	private ArrayList<Watch> listWatch;
	
	public Movie(String name, String genre) {
		this.name = name;
		this.genre = genre;
	}
	
	public Movie(String name, String genre, ArrayList<Watch> watch) {
		this.name = name;
		this.genre = genre;
		this.listWatch = watch;
	}
	
	public void setWatch(ArrayList<Watch> watch) {
		this.listWatch = watch;
	}
	
	public void addWatch(Watch watch) {
		if (this.listWatch == null) {
			this.listWatch = new ArrayList<Watch>();
		}
		
		listWatch.add(watch);
	}
	
	public ArrayList<Watch> getListWatch(){
		return listWatch;
	}
	
}
