package main;
import java.util.Scanner;
import Employee.Employee;
import manager.Manager;

public class Main {
	//Instance variable to store users choice
	int choice;
	//Creating an instance of Main class
	static Main m = new Main();
	// Scanner object to read user input
	Scanner sc = new Scanner(System.in);

	//Main method
	public static void main(String[] args) {
		//Try block to check for an exception
		try {
			m.displayPrompt();
			m.employeeOperations();
		}//Catch block to handle the exceptions 
		catch (Exception e) {
			System.out.println("Kindly, Enter valid input!");
		}
	}

	// Method to handle user interactions and perform operations based on user's choice
	public void employeeOperations() {
		switch (choice) {
		// case 1 condition to add employee
			case 1:
				System.out.print("Enter Employee ID:");
				int id = sc.nextInt();
				System.out.print("Enter Employee Name:");
				String name = sc.next();
				System.out.print("Enter Employee Designation:");
				String designation = sc.next();
				System.out.print("Enter Employee Salary:");
				double salary = sc.nextDouble();
				Manager.addEmployee(new Employee(id, name, designation, salary));
				m.displayPrompt();
				m.employeeOperations();
				break;
			// case 2 condition to display employees
			case 2:
				Manager.displayEmployees();
				m.displayPrompt();
				m.employeeOperations();
				break;
			// case 3 condition to search for an employee
			case 3:
				System.out.print("Enter Employee ID to search:");
				int searchId = sc.nextInt();
				Manager.searchEmployee(searchId);
				m.displayPrompt();
				m.employeeOperations();
				break;
			// case 4 condition to exit the program
			case 4:
				System.out.println("Exiting the program...");
				return;
			// default condition when the invalid choice is Entered
			default:
				System.out.println("Kindly, Enter the valid choice!\n");
				m.displayPrompt();
				m.employeeOperations();
		}
	}

	// Method to display the main menu and prompt the user for their choice
	public void displayPrompt() {
		System.out.println("Employee Management System\n\nChoose an operation:\r\n" + "1. Add Employee\r\n"
				+ "2. Display Employees\r\n" + "3. Search Employee\r\n" + "4. Exit\r\n" + "");
		System.out.print("Enter you choice:");
		choice = sc.nextInt();
		System.out.println();
	}
}
