package com.shuva.problem2;

import java.util.Scanner;

public class Prob2 {
	protected int  num1, num2;
	public void setNum1(int num1) {
		this.num1 = num1;
	}
	public void setNum2(int num2) {
		this.num2 = num2;
	}
	public int getNum1() {
		return num1;
	}
	public int getNum2() {
		return num2;
	}
	public static void main(String[] args) {
		Prob2 obj2 = new Prob2();
		Scanner src = new Scanner(System.in);
		System.out.println("Enter the 1st Number : ");
		obj2.setNum1(src.nextInt());
		System.out.println("Enter the 2nd Number : ");
		obj2.setNum2(src.nextInt());
		
		/*if (obj2.getNum1() > obj2.getNum2()) {
			System.out.println("Number 1 is big and Number 2 is small.");
		}
		else if (obj2.getNum1() == obj2.getNum2()) {
			System.out.println("Number 1 and Number 2 is Equal");
		}
		else {
			System.out.println("Number 2 is big and Number 1 is small.");
		}*/
		System.out.println("Maximum number is : "+((obj2.getNum1() > obj2.getNum2())?obj2.getNum1():obj2.getNum2()));
	}
}