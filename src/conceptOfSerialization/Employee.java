package conceptOfSerialization;

/**
 * As mentioned in the assignment,
 * Create an Employee class with three properties:
 *firstName
 *lastName
 *serialVersionUID
 *and Save the Employee class object in ‘employee.txt’ file.
 */
import java.io.Serializable;

//Creates the class and extend it with Serializable the interface.
//If a class implements serializable then all its sub classes will also be serializable.
public class Employee implements Serializable {
 
//NOTE: The String class and all the wrapper classes implements Serializable interface by default.	
	// Declaring Employee class variable the variable 
	String firstName = null;
	String lastName = null;
	private static long serialVersionUID;

    //Creating method 
	public Employee(String firstName, String lastName, long serialVersionUID) {
		
		// Gives reference to the objects 
		this.firstName = firstName; 
		this.lastName = lastName;
		this.serialVersionUID = (long) serialVersionUID;
	}

	public String employeeStat() {
		return "First Name: " + firstName + "Last Name: " + lastName + "ID" + serialVersionUID;
	}

	

}
