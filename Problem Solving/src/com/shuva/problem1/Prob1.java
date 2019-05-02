package com.shuva.problem1;

import java.util.Scanner;

//making a simple calculator

public class Prob1 {
	
	public void add(int a, int b) {
		System.out.println("Result = " +(a+b));
	}
	public void add(int a, int b, int c) {
		System.out.println("Result = "+(a+b+c));
	}
	public void add(int a, int b, int c, int d) {
		System.out.println("Result = "+(a+b+c+d));
	}
	public void subtract(int a, int b) {
		System.out.println("Result = "+(a+b));
	}
	public void subtract(int a, int b, int c) {
		System.out.println("Result = "+(a+b+c));
	}
	public void subtract(int a, int b, int c, int d) {
		System.out.println("Result = "+(a+b+c+d));
	}
	public void divide(int a, int b) {
		System.out.println("Result = "+(a/b));
	}
	public void divide(int a, int b, int c) {
		System.out.println("Result = "+(a/b)/c);
	}
	public void divide(int a, int b, int c, int d) {
		System.out.println("Result = "+((a/b)/c)/d);
	}
	public void mult(int a, int b) {
		System.out.println("Result = " +(a*b));
	}
	public void mult(int a, int b, int c) {
		System.out.println("Result = "+(a*b*c));
	}
	public void mult(int a, int b, int c, int d) {
		System.out.println("Result = "+(a*b*c*d));
	}
	
	public static void main(String[] args) {
		Prob1 obj = new Prob1();
		int number1, number2;
		Scanner src = new Scanner(System.in);
		System.out.println("Enter the First Number: ");
		number1 = src.nextInt();
		System.out.println("Enter the second Number: ");
		number2 = src.nextInt();
		System.out.println("Enter the Third Number : ");
		int number3 = src.nextInt();
		obj.add(number1, number1, number3);
	}

}
