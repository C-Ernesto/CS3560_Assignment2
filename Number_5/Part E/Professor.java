
public class Professor extends Employee{
	private String field;
	
	public Professor(String newName, int newHours, String newField) {
		super(newName, newHours);
		this.field = newField;
	}
	
	@Override
	public double calculateSalary() {
		return getHours() * 30;
	}
}
