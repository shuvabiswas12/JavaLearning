package enumeration_test_3;

public class TestProject {

	public enum Animal{ DOG, BIRD, FISH }
	
	private static Animal selectedAnimal;
	
	public static void main(String[] args) {
		
		selectedAnimal = Animal.FISH;
		
		if (selectedAnimal.equals(Animal.DOG)) {
			System.out.println("This is Dog");
		}
		else if (selectedAnimal.equals(Animal.BIRD)) {
			System.out.println("This is Bird");
		}
		else if (selectedAnimal.equals(Animal.FISH)) {
			System.out.println("This is Fish");
		}

	}

}
