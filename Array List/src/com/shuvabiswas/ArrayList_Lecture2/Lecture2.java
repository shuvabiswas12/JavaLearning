package com.shuvabiswas.ArrayList_Lecture2;

import java.util.ArrayList;

public class Lecture2 {

	public static void main(String[] args) {
		
		ArrayList<Integer>number = new ArrayList<>();
		
		number.add(20);
		number.add(30);
		number.add(50);
		
		System.out.println(number);
		
		for (int x : number) {
			System.out.print(x+" ");
		}
		
		int index = number.indexOf(30);
		System.out.println("\n"+index);
		
		boolean res = number.contains(20);
		System.out.println("\n"+res);
		
		boolean value = number.isEmpty();
		System.out.println(value);
		
		number.set(2, 70);
		
		int data = number.get(2);
		System.out.println(data);
		
		number.clear();
		System.out.println(number);	
	}
}
