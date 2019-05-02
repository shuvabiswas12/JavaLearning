package com.shuvabiswas.string_program;

public class StringMethod_2 {

	public static void main(String[] args) {
		
		String names1 = "Shuva";
		String names2 = " Biswas";
		
		
		
		/*String fullNames = names1+names2;
		System.out.println(fullNames);*/
		
		
		
		String fullName = names1.concat(names2);
		System.out.println(fullName);
		
		
		
		String upperCase = names1.toUpperCase();
		System.out.println(upperCase);
		
		
		
		String lowerCase = names2.toLowerCase();
		System.out.println(lowerCase);
		
		
		
		
		boolean value = names1.startsWith("S");
		System.out.println(value);
		
		
		
		value = names2.endsWith("as");
		System.out.println(value);
		
		
		
	}

}
