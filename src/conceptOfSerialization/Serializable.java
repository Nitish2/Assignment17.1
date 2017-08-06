package conceptOfSerialization;

/**
 * Serialization is a mechanism of writing the state of an object into a byte stream.
 * It is used to "mark" java classes so that objects of these classes may get certain capability.
 */
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class Serializable { // Creates class
	public static void main(String[] args) { // Main class

		// Creating Employee class object
		Employee nub = new Employee("Nitish", "Negi", 43252235);

		try {
			// Perform File Write operation
			FileOutputStream fout = new FileOutputStream("E:/Employee.txt");

			/* The ObjectOutputStream class is used to write primitive data
			   types and objects to an OutputStream.
			 */
			
			ObjectOutputStream out = new ObjectOutputStream(fout); // Perform File read operation
			out.writeObject(nub); // It provides the functionality to serialize
									// the object
			out.flush(); // Flushes the current output stream

			System.out.println("Sucess in Serialization concept");// Print success statement
																	
		} catch (IOException e) { 
			e.printStackTrace();
		}

	}

}
