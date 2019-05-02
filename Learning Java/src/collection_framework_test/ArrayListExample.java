package collection_framework_test;

import java.util.*;

public class ArrayListExample {

	public static void main(String[] args) {
		
		
		
		List<String> nameList = new ArrayList<>();
		
		
		nameList.add("Shuva");
		nameList.add("Sangeeta");
		nameList.add("Ananya");
		nameList.add("Oindrila");
		
		
		System.out.println("Size = " + nameList.size());
		
		
		System.out.println("Elements = " +nameList);
		
		System.out.println("Element of 2nd index = " +nameList.get(2));
		
		nameList.remove(0);
		
		System.out.println("After remove of 1st index = " + nameList);
		System.out.println("Sangeeta is here ?? \nAns = " + nameList.contains(nameList.get(0)));
		
		System.out.println("Any element is here ??\nAns = " + nameList.isEmpty());
		
		nameList.removeAll(nameList);
		System.out.println("Any element is here ??\nAns = " + nameList.isEmpty());
		
		

	}

}
