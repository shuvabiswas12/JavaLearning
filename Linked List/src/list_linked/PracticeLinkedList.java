package list_linked;

import java.util.LinkedList;

public class PracticeLinkedList {

	public static void main(String[] args) {
		
		Student s1 = new Student("Shuva", "BSC 4th year", 101);
		Student s2 = new Student("Sangeeta", "BSC 3rd Year", 102);
		Student s3 = new Student("Nirupoma", "BSC 3rd year", 103);
		
		LinkedList<Student> students = new LinkedList<>();
		students.add(s1);
		students.add(s2);
		students.add(s3);
		
		for(Student temp : students) {
			System.out.println("Name = "+temp.getName()+"\t Class = "+temp.getClassName()+"\tId = "+temp.getId());
			System.out.println();
		}

	}

}

class Student {
	
	private String name, className;
	private int id;
	
	public Student(String name, String className, int id) {
		this.setName(name);
		this.setClass(className);
		this.setId(id);
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public void setClass(String className) {
		this.className = className;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public String getClassName() {
		return className;
	}
	
	public int getId() {
		return id;
	}
}