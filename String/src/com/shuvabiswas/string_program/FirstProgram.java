package com.shuvabiswas.string_program;

import java.util.Scanner;

public class FirstProgram {

	public static void main(String[] args) {
		
		// way 1
		
		String names = "My Name is";
		String names1 = new String(" Shuva Biswas'.");
		
		System.out.println(names+names1);
		
		
		
		// way 2
		
		char[] name = {'I', ' ', 'a', 'm', ' ', 'f', 'r', 'o', 'm'};
		char[] name1 = {' ', 'c', 'h', 'i', 't', 't', 'a', 'g', 'o', 'n', 'g', '.', ' '};
		
		System.out.print(name);
		System.out.println(name1);
		
		
		
		// way 3
		
		String[] strings = new String[4];
		
		System.out.print("\n\nEnter string here:");
		for (int i=0; i<strings.length; i++) {
			strings[i] = new Scanner(System.in).nextLine();
		}
		
		for (String string : strings) {
			System.out.println(string+" ");
		}
		
		
		
		
		
		// way 4
		
		String[] city = {"Chittagong", "Dhaka", "Noakhali", "Feni"};
		for (int i=0; i<city.length; i++) {
			System.out.print(city[i]+" ");
		}
	}

}
