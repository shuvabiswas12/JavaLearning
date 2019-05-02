package com.shuva.problem6;

import java.util.Scanner;

public class Prob6Vol2 {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.print("Enter the character: ");
		char ch = src.next().charAt(0);
		switch(ch) {
		
		case 'a':
		case 'A':
			System.out.println("This is Vowel.");
			break;
			
		case 'e':
		case 'E':
			System.out.println("This is Vowel.");
			break;
			
		case 'i':
		case 'I':
			System.out.println("This is Vowel.");
			break;
			
		case 'o':
		case 'O':
			System.out.println("This is Vowel.");
			break;
			
		case 'u':
		case 'U':
			System.out.println("This is Vowel.");
			break;
		default:
			System.out.println("This is Consonant.");
			break;
		}
	}

}
