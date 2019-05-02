package com.shuva.problem6;

import java.util.Scanner;

public class Prob6 {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.print("Enter the Character: ");
		char ch = src.next().charAt(0);
		switch (ch) {
		case 'a':
			System.out.println("This is Vowel.");
			break;
		
		case 'e':
			System.out.println("This is Vowel.");
			break;
		
		case 'i':
			System.out.println("This is Vowel.");
			break;
			
		case 'o':
			System.out.println("This is Vowel.");
			break;
			
		case 'u':
			System.out.println("This is Vowel.");
			break;
			
		default:
			System.out.println("This is Consonant.");
			break;
		}
	}

}
