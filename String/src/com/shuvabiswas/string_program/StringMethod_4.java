package com.shuvabiswas.string_program;

public class StringMethod_4 {

	public static void main(String[] args) {
		
		String string = "This is my country";
		System.out.println(string);
		
		
		// its divide the whole string into a string type array
		String[] name = string.split(" ");
		for (String x: name) {
			System.out.println(x);
		}
		
		
		String newString = string.replace('i', 'j');
		System.out.println(newString);
		
		}

}
