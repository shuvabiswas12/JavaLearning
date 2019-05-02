package generics_method;


import java.util.*;

public class GenericsMethod {

	public static void main(String[] args) {
		
		List<String> names = new ArrayList<>();
		
		names.add("Foo");
		names.add("Zoo");
		names.add("etc");
		
		System.out.println(TestGenericsMethod.findElementInList("Zoo", names));
		

	}

}


/* Generic Method Example */
class TestGenericsMethod {
	
	public static <T> boolean findElementInList (T object, List<T> list) {
		
		for (T element : list) {
			if (element.equals(object)) {
				return true;
			}
		}
		
		return false;
		
	}
}
