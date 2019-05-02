package hash_set;

import java.util.HashSet;

public class HashTest {

	// hash set doesn't keep duplicate elements 
	
	public static void main(String[] args) {
		
		HashSet<String> customer = new HashSet<>();
		
		customer.add("Shuva");
		customer.add("Nirupoma");
		customer.add("Sangeeta");
		
		System.out.println(customer);
		System.out.println(customer.size());
		
		customer.remove("Nirupoma");
		System.out.println(customer);
		
		customer.clear();
		System.out.println(customer.isEmpty());

	}

}
