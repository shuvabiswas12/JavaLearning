package program3;

public class TestDownCasting {

	public static void main(String[] args) {
		
		Animal dog = new Dog();
		System.out.println("I am "+dog.getName());
		//((Dog)dog).printName(); // downcasting
		Dog dog2 = (Dog)dog;
		dog2.printName();
		
		Animal bird = new Bird();
		System.out.println("I am "+bird.getName());
		
		//((Bird)bird).printName();
		/*Bird bird2 = (Bird)bird;
		bird2.printName();*/
		
	}

}

class Animal {
	
	protected String name;
	
	protected String getName() {
		return name;
	}
}

class Dog extends Animal {
	
	public Dog() {
		name = "Dog";
	}
	
	public void printName() {
		System.out.println("Name = "+this.getName());
	}
}

class Bird extends Animal {
	public Bird() {
		name = "Bird";
	}
	
	public void printName() {
		System.out.println("name = "+this.getName());
	}
}