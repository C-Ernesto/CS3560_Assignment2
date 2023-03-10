
public class Staff extends Employee{
	private int role;
	
	public Staff(String newName, int newHours, int newRole) {
		super(newName, newHours);
		this.role = newRole;
	}
}
