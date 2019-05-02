package com.shuvabiswas.ArrayList_Lecture1;

import java.util.ArrayList;

// adding and removing array elements from arrayList

public class Lecture1 {

	public static void main(String[] args) {
	
		ArrayList<Integer>number = new ArrayList<Integer>();
		
		System.out.println("Size = "+number.size());
		
		// for adding elements 
		number.add(10);
		number.add(20);
		number.add(30);
		number.add(3,40);
		
		
		// for printing elements
		for (int x : number) {
			System.out.print(x+" ");
		}
		
		
		System.out.print("\n"+number);
		System.out.println("\nSize = "+number.size());
		
		
		// for removing elements
		number.remove(2);
		System.out.println(number);
		number.removeAll(number);
		System.out.println(number);
	}
}
