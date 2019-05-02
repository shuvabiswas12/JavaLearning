package make_dir;

import java.io.File;

public class Directory {

	public static void main(String[] args) {
		
		// creating directory into project folder
		File dir = new File("Folder");
		dir.mkdir();
		
		
		
		// creating directory into another location which i recommend
		File dirTwo = new File("C:/Users/Shuva/Desktop/New Folder");
		dirTwo.mkdir();
		
		
		// for knowing path of directory
		String pathOfDir = dirTwo.getAbsolutePath();
		System.out.println(pathOfDir);
		
		
		//for knowing dir name
		String nameOfDir = dirTwo.getName();
		System.out.println(nameOfDir);
		
		
		
		// deleting the directory
		dirTwo.delete();
		System.out.println("Deleted");

	}

}
