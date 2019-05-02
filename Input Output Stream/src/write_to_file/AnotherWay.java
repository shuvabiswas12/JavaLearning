package write_to_file;

import java.io.FileNotFoundException;
import java.util.Formatter;
import java.util.Scanner;

public class AnotherWay {

	public static void main(String[] args) {
		
		// formatter class create a file if there has not any file and write into the file .
		// if there stay a file then formatter class write into the file.
		// after write into the file formatter class should close.
		
		
		// example 1//
		try {
			
			Formatter formatter = new Formatter("F:/eclipse project/Input Output Stream/Folder/myFile1.txt");
			
			// writing into the file 
			formatter.format("%s %s \r\n", "101", "Shuva");
			formatter.format("%s %s \r\n", "102", "Ananya");
			formatter.format("%s %s \r\n", "103", "Suparna");
			
			formatter.close(); // closing the formatter class 
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
		
		
		
		
		// example 2//
		// this example show how to write data into file from taking user input
		try {
			
			Formatter formatter2 = new Formatter("F:/eclipse project/Input Output Stream/Folder/myFile2.txt");
			
			Scanner input = new Scanner(System.in);
			
			
			for(int i=0; i<4; i++) {
				
				System.out.println("Enter id and name of student: ");
				
				int id = input.nextInt();
				String name = input.next();
				
				formatter2.format("%d %s \r\n", id, name);
			}
			
			formatter2.close();
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}

	}

}
