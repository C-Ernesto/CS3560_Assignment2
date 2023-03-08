import java.util.ArrayList;

public class Person {
	private String name;
	private ArrayList<Watch> listWatch;
	
	public Person(String name) {
		this.name = name;
	}
	
	public Person(String name, ArrayList<Watch> watch) {
		this.name = name;
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
	
}
