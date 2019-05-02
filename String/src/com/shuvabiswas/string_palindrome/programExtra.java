package com.shuvabiswas.string_palindrome;

public class programExtra {

	public static void main(String[] args) {
		String string1 = "madam";
		StringBuffer string2 = new StringBuffer(string1);
		
		String string3 = string2.reverse().toString();
		
		if (string1.equals(string3)) {
			System.out.println("palindrome");
		}
		else {
			System.out.println("it is not palindrome");
		}

	}
}
