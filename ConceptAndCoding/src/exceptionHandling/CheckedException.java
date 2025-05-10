package exceptionHandling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class CheckedException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//String fileName =  "abcbbb.txt";
		
//		PrintWriter pw = new PrintWriter(fileName);
//		pw.write("s");
//		pw.close();
		
		
		// in the Below Code , although checked exception is handled 
		// or handling code is present like try catch block
		// the exception will arise at the run time if file specified is not found
		File file = new File("existing_file.txt");
		
		if (!file.exists()) {
            try {
                throw new FileNotFoundException();
            } catch (FileNotFoundException e) {
                System.out.println();
                e.printStackTrace();
                return;  // Exit the program if the file doesn't exist
            }
        }
		
		
		if (file.exists()) {
            try (PrintWriter writer = new PrintWriter(new FileWriter(file, true))) {  // true for append mode
                // Writing to the file (this will append data)
                writer.println("Appending this line to the existing file.");
                writer.println("This is another appended line.");

                System.out.println("Data successfully written to the file!");
            } catch (IOException e) {
                System.out.println("An error occurred while writing to the file.");
                e.printStackTrace();
            } 
        } 

	}

}
