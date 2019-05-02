package com.shuvabiswas.ArrayList_Lecture4;

import java.util.ArrayList;
import java.util.Collections;

public class Lecture4 {

	public static void main(String[] args) {
		
		ArrayList<Integer> number = new ArrayList<>();
		
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(1);
		number.add(2);
		number.add(3);
		number.add(18);
		number.add(78);
		number.add(95);
		number.add(-6);
		number.add(0);
		number.add(-2);
		
		System.out.println(number);
		System.out.println("Size = "+number.size());
		
		// Ascending order
		Collections.sort(number);
		System.out.println(number);
		
		//Descending order
		Collections.sort(number, Collections.reverseOrder());
		System.out.println(number);
	}

}
