package com.shuvabiswas.string_builder;


// the method of StringBuffer and StringBuilder are same.

public class Program_String_Builder {

	public static void main(String[] args) {
		
		StringBuilder stringBuilder = new StringBuilder("Shuva");
		
		stringBuilder.append(" Biswas");
		stringBuilder.append(" Ritu");
		
		System.out.println(stringBuilder);
		
		int length = stringBuilder.length();
		System.out.println(length);
		
		
		stringBuilder.delete(0, 4);
		System.out.println(stringBuilder);
		
		stringBuilder.setLength(5);
		System.out.println(stringBuilder);
	}

}
