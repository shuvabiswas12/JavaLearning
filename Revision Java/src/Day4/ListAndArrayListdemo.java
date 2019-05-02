package Day4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListAndArrayListdemo {

	public static void main(String[] args) {
		
		List<String> nameList = new ArrayList<>();
		nameList.add("Shuva Biswas");
		nameList.add("Sangeeta Nandi");
		Collections.sort(nameList);
		System.out.println(nameList);
		Collections.sort(nameList, Collections.reverseOrder());
		System.out.println(nameList);
		
		for(String name : nameList) {
			System.out.println(name);
		}
		
		System.out.println(nameList.size());
		
		nameList.set(0,  "shuva biswas ritu");
		
		System.out.println(nameList.get(0));
		
		nameList.remove(0);
		System.out.println(nameList);
		nameList.removeAll(nameList);
		System.out.println(nameList);
		

	}

}
