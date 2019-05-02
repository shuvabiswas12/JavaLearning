package hash_map;

import java.util.HashMap;

public class Map {

	public static void main(String[] args) {
		
		HashMap<Integer, String> customer = new HashMap<>();
		
		customer.put(101, "Me");
		customer.put(102, "You");
		customer.put(103, "She");
		
		System.out.println(customer.get(101));
		System.out.println(customer.get(102));
		System.out.println(customer.get(103));

	}

}
