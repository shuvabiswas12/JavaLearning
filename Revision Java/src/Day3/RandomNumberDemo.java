package Day3;

import java.util.Random;

public class RandomNumberDemo {

	public static void main(String[] args) {
		
		Random number = new Random();
		
		int redno1 = number.nextInt(10);
		System.out.println(redno1);
		
		int redno2 = number.nextInt(5) + 4;
		System.out.println(redno2);
		
		float redno3 = number.nextFloat();
		System.out.println(redno3);
		
		double redno4 = number.nextDouble();
		System.out.println(redno4);

	}

}


