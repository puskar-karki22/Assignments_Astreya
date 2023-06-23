package manager;

import java.util.ArrayList;

import Employee.Employee;

public class Manager {
	// ArrayList to store employees
	static ArrayList<Employee> empList = new ArrayList<Employee>();

	// Method to add an employee to the list
	public static void addEmployee(Employee emp) {
		empList.add(emp);
		System.out.println("Employee added successfully!");
		System.out.println();
	}
	
	// Method to display all employees
	public static void displayEmployees() {
		System.out.println("Employee Details:\n");
		//Iterate t
		for (Employee e : empList) {
			System.out.println("ID:" + e.getId() + "\nName:" + e.getName() + "\nDesignation:" + e.getDesignation()
					+ "\nSalary:" + e.getSalary());
			System.out.println();
		}
	}

	// Method to search for an employee by ID
	public static void searchEmployee(int id) {
		boolean flag = false;
		System.out.println("Employee Details:\n");
		System.out.println();
		for (Employee e : empList) {
			if (e.getId() == id) {
				System.out.println("ID:" + e.getId() + "\nName:" + e.getName() + "\nDesignation:" + e.getDesignation()
						+ "\nSalary:" + e.getSalary());
				System.out.println();
				flag = true;
			}
		}
		if (flag == false) {
			System.out.println("No record found!");
			System.out.println();
		}
	}

}
