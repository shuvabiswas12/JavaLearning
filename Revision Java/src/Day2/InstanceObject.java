package Day2;

public class InstanceObject {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		Teacher teacher = new Teacher();
		Person person = new Person();
		
		
		System.out.println(animal instanceof Animal);
		System.out.println(teacher instanceof Teacher);
		System.out.println(person instanceof Person);
		
		System.out.println(person instanceof Animal);
		System.out.println(teacher instanceof Animal);
		System.out.println(teacher instanceof Person);

	}

}


class Animal {
	
}

class Teacher extends Animal {
	
}

class Person extends Teacher {
	
}