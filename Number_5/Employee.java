
public abstract class Employee {
	private String name;
	private int hours;
	
	public Employee(String newName, int newHours) {
		this.name = newName;
		this.hours = newHours;
	}
	
	public double calculateSalary() {
		return this.hours * 20;
	}
	
	public int getHours() {
		return this.hours;
	}
}
