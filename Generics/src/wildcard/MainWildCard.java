package wildcard;

import java.util.ArrayList;
import java.util.List;

public class MainWildCard {

	public static void main(String[] args) {
		
		List<String> name = new ArrayList<>();
		name.add("Foo");
		name.add("etc");
		
		Test.printCollection(name);

	}

}
