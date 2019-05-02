package firstProgram;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

public class ArrayListpractice {

	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		
		names.add("Shuva");
		names.add("Sangeeta");
		names.add("Nirupoma");
		names.add("Turna Das");
		
		ArrayList<String> namesList = new ArrayList<>();
		
		namesList.addAll(names);
		
		Collections.sort(names, Collections.reverseOrder());
		System.out.println(names);
		
		/*Collections.sort(namesList);
		System.out.println(namesList);*/
		
		/*System.out.println(namesList);
		int size = namesList.size();
		System.out.println(size);
		
		System.out.println(namesList.removeAll(namesList));
		
		System.out.println(namesList.isEmpty());
		
		System.out.println(names.contains("Sangeeta"));
		
		System.out.println(names.indexOf("Sangeeta"));
		
		names.set(1, "Sangeeta Nandi");
		System.out.println(names.get(1));
		
		names.clear();
		System.out.println(names);*/
		
	}

}
