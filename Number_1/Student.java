
public class Student {
	
	private String name;
	private String major;
	private double gpa;
	
	// Default value for name, major, and gpa is null, null, 0.0 respectively
	public Student() {
		this(null, null, 0.0);
	}
	
	public Student(String name, String major) {
		this(name, major, 0.0);
	}
	
	public Student(String name, String major, double gpa) {
		this.name = name;
		this.major = major;
		this.gpa = gpa;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getMajor() {
		return this.major;
	}
	
	public void setMajor(String major) {
		this.major = major;
	}
	
	public double getGPA() {
		return this.gpa;
	}
	
	public void setGPA(double gpa) {
		this.gpa = gpa;
	}
	
	public String toString() {
		String ret = String.format("Name: %s, Major: %s, GPA: %.1f", this.name, this.major, this.gpa);
		return ret;
	}
	
	public boolean equals(Student student) {
		if (this.name.equals(student.getName()) && this.major.equals(student.getMajor())) {
			return true;
		} else {
			return false;
		}
	}
}
