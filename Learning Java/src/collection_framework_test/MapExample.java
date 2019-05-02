package collection_framework_test;

import java.util.*;

public class MapExample {

	public static void main(String[] args) {
		
		Map<String, String> Student = new HashMap<>();
		
		Student.put("101", "Shuva");
		Student.put("102", "Nabil");
		Student.put("103", "Sangeeta");
		Student.put("104", "Mita");
		
		
		System.out.println(Student.get("103"));	
		
		System.out.println(Student.size());
		
		System.out.println(Student);
		
		System.out.println(Student.values());
		
		Student.remove("101");
		System.out.println(Student.values());
		
		Student.replace("102", "Nabil", "Shuva");
		
		System.out.println(Student.values());
		
		Student.clear();
		System.out.println(Student.isEmpty());
		
	}

}
