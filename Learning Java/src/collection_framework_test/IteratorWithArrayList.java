package collection_framework_test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorWithArrayList {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		
		list.add("a");
		list.add("b");
		list.add("c");
		
		
		Iterator itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		
		
		
		
		
		for (String s : list) {
			System.out.println(s);
		}

	}

}
