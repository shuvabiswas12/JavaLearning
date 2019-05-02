package com.shuva.problem2;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		Prob2 obj = new Prob2();
		Scanner src = new Scanner(System.in);
		System.out.println("Enter the Number 1 :");
		obj.num1 = src.nextInt();
		System.out.println("Enter the Number 2");
		obj.num2 = src.nextInt();
		/*if (obj.num1 > obj.num2) {
			System.out.println("Number 1 is big and Number 2 small.");
		}
		else if (obj.num1 == obj.num2) {
			System.out.println("Number 1 and Number 2 is equal.");
		}
		else
			System.out.println("Number 2 is big and Number 1 small.");
			
		}*/
		System.out.println((obj.num1>obj.num2)?obj.num1:obj.num2);
	}
}

