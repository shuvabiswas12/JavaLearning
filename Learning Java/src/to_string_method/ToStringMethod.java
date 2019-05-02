package to_string_method;

public class ToStringMethod {

	public static void main(String[] args) {
		
		Person p1 = new Person("Shuva", 23);
		Person p2 = new Person("Shritoma", 19);
		
		System.out.println("Person 1 : "+p1);
		System.out.println("Person 2 : "+p2);
		
	}

}

class Person {
	
	String name;
	int age;
	
	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}
	
	
	public String toString() {
		return "Name = "+name+"\t, Age = "+age;
	}
}