package read_from_file;

import java.io.File;
import java.util.Scanner;

public class Read {

	public static void main(String[] args) {
		
		
		
		try {
			
			File file = new File("F:/eclipse project/Input Output Stream/Folder/myFile1.txt");
			
			
			Scanner read = new Scanner(file);
			
			while(read.hasNext()) {
				int id = read.nextInt();
				String name = read.next();
				
				System.out.println("Id = "+id + "\tName = "+name);
			}
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}

}
