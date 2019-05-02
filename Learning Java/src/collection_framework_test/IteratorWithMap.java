package collection_framework_test;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class IteratorWithMap {

	public static void main(String[] args) {
		
		Map< String, String> map = new HashMap<>();
		
		map.put("101", "Shuva");
		map.put("102", "Sangeeta");
		
		// System.out.println(map.values());
		
		Set set = map.entrySet();
		Iterator itr = set.iterator();
		
		while (itr.hasNext()) {
			
			Map.Entry mEntry = (Map.Entry) itr.next();
			System.out.print(mEntry.getKey() + " : ");
			
			System.out.println(mEntry.getValue());
		}
		
		//System.out.println(map);

	}

}
