package com.shuvabiswas.string_program;

public class StringMethod_1 {

	public static void main(String[] args) {
		
		String names = "Shuva Biswas";
		String names2 = "Ritu Biswas";
		String names4 = new String("Shuva Biswas");
		
	
		if (names == names4) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		
		
		
		if (names.equals(names4)) {
			System.out.println("true");
		}
		else {
			System.out.println("false");
		}
		
		
		
		boolean val = names.contains("Biswas");
		System.out.println(val);
		
		
		
		boolean val2 = names.equalsIgnoreCase("shuva biswas");
		System.out.println(val2);
		
		
		
		System.out.println(names2.isEmpty());
	}

}
