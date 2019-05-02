package create_a_file;

import java.io.File;

public class CreatingFile {

	public static void main(String[] args) {
		
		// creating file into default project directory
		File file1 = new File("New File-1.txt");
		File file2 = new File("New File-2.txt");
		
		try{
			file1.createNewFile();
			file2.createNewFile();
			System.out.println("Files are created");
		}
		catch(Exception e) {
			System.out.println(e);
		}
		
		
		
		
		// creating files into another location
		
		File myFile1 = new File("F:/eclipse project/Input Output Stream/Folder/myFile1.txt");
		File myFile2 = new File("F:/eclipse project/Input Output Stream/Folder/myFile2.txt");
		
		try {
			myFile1.createNewFile();
			myFile2.createNewFile();
			System.out.println("Files are created");
		}
		catch (Exception e) {
			System.out.println(e);
		}
		
		// checking file is exists or not
		boolean isExists = myFile1.exists();
		System.out.println(isExists);

	}

}
