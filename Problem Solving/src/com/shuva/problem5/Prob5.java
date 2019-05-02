package com.shuva.problem5;

import java.util.Scanner;

public class Prob5 {
	
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("Enter the Number :");
		int number = src.nextInt();
		if(number>=80) {
			System.out.println("A+");
		}
		else if (number>=70) {
			System.out.println("A");
		}
		else if (number>=60) {
			System.out.println("A-");
		}
		else if (number>=50) {
			System.out.println("B");
		}
		else if (number>=40) {
			System.out.println("C");
		}
		else if (number>=33) {
			System.out.println("D");
		}
		else {
			System.out.println("F. You failed.");
		}
		
	}

}
