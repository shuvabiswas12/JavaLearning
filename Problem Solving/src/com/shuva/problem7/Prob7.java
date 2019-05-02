package com.shuva.problem7;

import java.util.Scanner;

public class Prob7 {

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		System.out.println("Enter the 1st Number: ");
		int number1 = src.nextInt();
		System.out.println("Enter the 2nd Number: ");
		int number2 = src.nextInt();
		System.out.println("Enter the 3rd Number: ");
		int number3 = src.nextInt();
		
		if ((number1>number2) && (number1>number3)) {
			if (number2>number3) {
				System.out.println("Number 1 largest and Number 3 is smallest");
			}
			else
			{
				System.out.println("Number 1 largest and Number 2 is smallest");
			}
		}
		else
		{
			if ((number2>number1) && (number2>number3)) {
				if (number1>number3) {
					System.out.println("Number 2 is largest and Number Number 3 is smallest");
				}
				else
				{
					System.out.println("Number 2 is largest and Number 1 is smallest");
				}
			}
			else
			{
				if ((number3>number1) && (number1<number2)) {
					System.out.println("Number 3 largest and Number 1 is smallest");
				}
				else
				{
					System.out.println("Number 3 is largest and Number 2 is smallest");
				}
			}
		}

	}

}
