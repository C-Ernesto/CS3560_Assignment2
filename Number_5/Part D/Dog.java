import java.util.ArrayList;
import java.util.Collections;

public class Dog {
	private String breed;
	private String name;
	private ArrayList<Paw> listPaw;
	
	public Dog() {
		this.breed = null;
		this.name = null;
		this.listPaw = new ArrayList<Paw>();
		listPaw.add(new Paw(1, this));
		listPaw.add(new Paw(2, this));
		listPaw.add(new Paw(3, this));
		listPaw.add(new Paw(4, this));
	}
	
	public void setPaw(ArrayList<Paw> paw) {
		this.listPaw = paw;
	}
}
