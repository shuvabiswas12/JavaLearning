package com.shuvabiswas.string_program;

public class StringMethod_3 {

	public static void main(String[] args) {
		
		String country = "    Bangladesh is     my country    ";
		System.out.println(country);
		
		
		// cutting space of first and last OfDouble a sentence but not the middle
		String ch1 = country.trim();
		System.out.println(ch1);
		
		
		// find the char of index
		char char1 = ch1.charAt(0);
		System.out.println(char1);
		
		
		// finding index of char
		int pos = ch1.indexOf("is");
		System.out.println(pos);
		
		
		// finding last index of char
		int posLast = ch1.lastIndexOf('n');
		System.out.println(posLast);
		
		
		// finding ASCII value of index
		int ascii = ch1.codePointAt(0);
		System.out.println(ascii);
	}

}
