package write_to_file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

public class Write {

	public static void main(String[] args) {
		
		// for creating file
		File file = new File("src/test.txt");
		
		
		// for writing file
		try(FileWriter fileWriter = new FileWriter(file)) {
			
			fileWriter.write("Today is amazing day... ");
			fileWriter.close();
			
			
			// for reading file
			FileReader fileReader = new FileReader(file);
			BufferedReader bufferedReader = new BufferedReader(fileReader);
			
			String line = null;
			
			while((line = bufferedReader.readLine())!=null){
				System.out.println(line);
			}
			
		} catch (Exception e) {
			
		}

	}

}
