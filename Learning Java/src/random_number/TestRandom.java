package random_number;

import java.util.Random;

public class TestRandom {

	public static void main(String[] args) {
		
		Random random = new Random(); // random class
		
		int radNo = random.nextInt(10); // range = 0 to 9 (max)
		System.out.println("No = "+radNo);
		
		int radNo2 = random.nextInt(3); // range = 0 to 2 (max)
		System.out.println("No = "+radNo2);
		
		int radNo3 = random.nextInt(5) + 5; // here max value = 9 and min value = 4
		System.out.println("no = "+radNo3);
		
		float number = random.nextFloat();
		System.out.println("No = "+number);
		
		double numberDouble = random.nextDouble();
		System.out.println("No = "+numberDouble);
		
		
		
		// here us a different way to generate random number
		// here i use math class to generate random number
		
		int newNumber = (int)(Math.random()*10)+1;
		System.out.println("Random no = "+newNumber);

	}

}
