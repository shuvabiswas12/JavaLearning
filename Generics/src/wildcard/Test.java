package wildcard;
import java.util.*;

public class Test {
	
	public static void printCollection (List<?> obj) {
		
		for (Object elements : obj) {
			System.out.println(elements);
		}
	}

}
