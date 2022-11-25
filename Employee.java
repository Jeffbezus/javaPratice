package praticando;

public class Employee {
	private int id;
	private double salary;
	private String name;
		
	
	public String toString() {
		return "------------------------\n"
				+ "Employee data: \n"
				+ "Id: " + id + "\n"
				+ "Name: " + name + "\n"
				+ "Salary: " + salary + "\n";
				
	}
	public Employee(int id, double salary, String name) {
		this.setId(id);
		this.setSalary(salary);
		this.setName(name);
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}