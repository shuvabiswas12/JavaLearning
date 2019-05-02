package hash_map;

import java.util.HashMap;

public class Test {

	public static void main(String[] args) {
		
		HashMap map = new HashMap<>();
		// HashMap<String, Integer> user = new HashMap<>();
		
		map.put("Shuva", 300);
		map.put("Mrittika", 370);
		
		System.out.println(map.get("Shuva"));
		
		if (map.containsKey("Mrittika")) {
			System.out.println("yay");
		}
		else {
			System.out.println("No");
		}
		
		System.out.println("value = "+map.values());

		System.out.println("value = "+map.entrySet());
	}

}
