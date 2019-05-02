package com.shuva.problem3;

import java.util.Scanner;

public class Prob3 {
	public static void main(String[] args) {
		char ch1;
		/*for(ch1 = 'A'; ch1!='Z'; ch1++) {
			System.out.println(ch1+" = "+(int)ch1);
		}
		System.out.println(ch1+" = "+(int)ch1);
		
		for(ch1='a'; ch1!='z'; ch1++) {
			System.out.println(ch1+" = "+(int)ch1);
		}
		System.out.println(ch1+" = "+(int)ch1);*/
		Scanner src = new Scanner(System.in);
		System.out.println("Enter the Character: ");
		ch1 = src.next().charAt(0);
		System.out.println(ch1+" = "+(int)ch1);
	}
	
}
