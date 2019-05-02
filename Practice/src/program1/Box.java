package program1;

import java.util.ArrayList;

public class Box {
	
	public static void main(String[] args) {
		int num = 10;
		char s = 's';
		
		Integer number = new Integer(num);
		System.out.println(number);
		
		Character character = new Character(s);
		System.out.println(character);
		
		ArrayList myArrayList = new ArrayList();
		myArrayList.add(num);
		
		int number1 = (int) myArrayList.get(0);
		System.out.println(number1);
		
		Integer number2 = 30;
		System.out.println(number2);
		
		int newNum = 40;
		Integer nInteger = Integer.valueOf(newNum);
		System.out.println(nInteger);
		
		Double nInteger2 = new Double(30.00);
		System.out.println(nInteger2);
		
		Float nFloat = new Float(3.0);
		float f = nFloat.floatValue();
		System.out.println(f);
		
		float f2 = nFloat;
		System.out.println(f2);
		
	}

}
