package com.shuvabiswas.arrayProgram;

import java.util.Arrays;

public class StringSorting {

	public static String name[]={"shuva", "nipun", "niloy", "rakib", "sangeeta"};
	public static int i;
	
	public static void main(String[] args) {
		
		System.out.println("Array of string before sorted: ");
		for (i=0; i<name.length; i++) {
			System.out.print(name[i]+" ");
		}
		
		Arrays.sort(name);
		
		System.out.println("\nArray of string after sorted: ");
		for (i=0; i<name.length; i++) {
			System.out.print(name[i]+" ");
		}
		
		// decending order
		System.out.println("\n Array of string decending order sorting: ");
		for (i=name.length-1; i>=0; i--) {
			System.out.print(name[i]+" ");
		}
	}
}
