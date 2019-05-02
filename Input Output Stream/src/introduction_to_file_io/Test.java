package introduction_to_file_io;

import java.io.IOException;

public class Test {
	
	public static void main(String[] args) throws IOException {
		
		byte [] data = new byte[11];
		
		System.out.println("Enters Some Characters : ");
		
		System.in.read(data);
		
		System.out.println("You Entered : ");
		
		for (int i=0; i<data.length; i++) {
			System.out.print((char)data[i]);
		}
	}

}
