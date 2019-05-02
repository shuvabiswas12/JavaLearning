package set_and_hash_sets;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class MyClass {

	public static void main(String[] args) {
		
		
		// set
		Set<Object> set = new HashSet<>();
		
		set.add(88);
		set.add(90);
		set.add(40);
		set.add(70);
		set.add(28);
		
		int size = set.size();
		System.out.println(size);
		System.out.println(set);
		
		set.remove(88);
		System.out.println(set);
		
		System.out.println(set.contains(88));
		
		
		// tree set
		// tree set is the sorted set
		
		TreeSet sortedSet = new TreeSet(set);
		System.out.println(sortedSet);

	}

}
