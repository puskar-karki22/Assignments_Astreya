package Employee;

public class Employee {
	//Declaration of Employee variables
	private int id;
	private String name;
	private String designation;
	private double salary;

	// Parameterized constructor to initialize Employee object
	public Employee(int id, String name, String designation, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.designation = designation;
		this.salary = salary;
	}
	
	// Default constructor
	public Employee() {
		super();
	}

	// Getter for employee ID
	public int getId() {
		return id;
	}

	// Getter for employee name
	public String getName() {
		return name;
	}

	// Getter for employee designation
	public String getDesignation() {
		return designation;
	}

	// Getter for employee salary
	public double getSalary() {
		return salary;
	}



}
