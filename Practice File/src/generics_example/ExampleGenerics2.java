package generics_example;

import java.util.ArrayList;
import java.util.List;

public class ExampleGenerics2 {

	public static void main(String[] args) {
		
		List<String> nameList = new ArrayList<>();
		nameList.add("Shuva");
		nameList.add("Biswas");
		nameList.add("Ritu");
		
		Test.printCollection(nameList);

	}

}

class Test {
	public static void printCollection (List<?> obj) {
		
		for (Object object : obj) {
			System.out.println(object);
		}
	}
}
