package com.shuvabiswas.ArrayList_Lecture3;

import java.util.ArrayList;

public class Lecture3 {

	public static void main(String[] args) {
		
		ArrayList<Integer> number = new ArrayList<>();
		
		ArrayList<Integer> number2 = new ArrayList<>();
		
		ArrayList<Integer> number3 = new ArrayList<>();
		
		number.add(10);
		number.add(12);
		number.add(14);
		number.add(15);
		number.add(4,40 );
		
		number2.add(1);
		number2.add(2);
		number2.add(4);
		number2.add(5);
		number2.add(4,6 );
		
		
		number3.addAll(number2);
		
		System.out.println(number);
		
		System.out.println(number2);
		
		System.out.println(number3);
		
		
		boolean result = number.equals(number2);
		System.out.println(result);
		
		result = number.equals(number3);
		System.out.println(result);
		
		result = number2.equals(number3);
		System.out.println(result);
		
		
		
	}

}
