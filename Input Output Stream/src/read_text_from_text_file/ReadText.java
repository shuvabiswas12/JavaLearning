package read_text_from_text_file;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadText {

	public static void main(String[] args) throws IOException {
		
		File file = new File("src/test.txt");
		
		try (FileInputStream fileInputStream = new FileInputStream(file)){
			
			System.out.println("Total size to read in byte is " + fileInputStream.available());
			
			int content;
			
			while((content = fileInputStream.read())!=-1) {
				
				// convert int to char
				System.out.print((char)content);
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}

		
		
		
	}

}
