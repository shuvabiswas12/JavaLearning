package com.shuva.problem4;

import java.util.Scanner;

public class Prob4 {
	private char ch1;
	 public static void main(String[] args) {
		 Scanner src = new Scanner(System.in);
		 System.out.print("Enter a Character: ");
		 Prob4 prob4=new Prob4();
		 prob4.ch1 = src.next().charAt(0);
		 System.out.print("Enter the another character: ");
		 char ch2 = src.next().charAt(0);
		 
		 if(prob4.ch1 > ch2) {
			 System.out.println(prob4.ch1+" is greater than (1)"+ch2);
		 }
		 else if (prob4.ch1 == ch2) {
			System.out.println(prob4.ch1+" and "+ch2+" are equal");
		}
		 else {
			System.out.println(ch2+" is greater than (2)"+prob4.ch1);
		}
	 }
	
}
