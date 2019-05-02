package com.shuva.problem5;

import java.util.Scanner;

public class Prob5Vol2 {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int number = src.nextInt();
		switch (number/10) {
		case 10:
		case 9:
		case 8:
			System.out.println("A+");
			break;
		case 7:
			System.out.println("A");
			break;
		case 6:
			System.out.println("A-");
			break;
		case 5:
			System.out.println("B");
			break;
		case 4:
			System.out.println("C");
			break;
		case 3:
			System.out.println("D");
			break;
		default:
			System.out.println("F. You failed");
			break;
		}

	}

}
