package com.shuva.problem8;

import java.util.Scanner;

public class Prob8 {

	public static void add(int a, int b) {
		System.out.println(a+b);
	}
	
	public static void sub(int a, int b) {
		System.out.println(a-b);
	}
	
	public static void mult(int a, int b) {
		System.out.println(a*b);
	}
	
	public static void divide(int a, int b) {
		System.out.println(a/b);
	}
	
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int num1 = src.nextInt();
		System.out.println("Enter the second number: ");
		int num2 = src.nextInt();
		System.out.println("Enter the Key (1/2/3/4)");
		int input = src.nextInt();
		switch (input) {
		
		case 1:
			add(num1, num2);
			break;
		case 2:
			sub(num1, num2);
			break;
		case 3:
			mult(num1, num2);
			break;
		case 4:
			divide(num1, num2);
			break;
		default:
			System.out.println("You entered wrong input");
			break;
		}
	}

}
