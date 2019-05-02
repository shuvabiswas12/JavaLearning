package com.shuva.problem11;

import java.util.Scanner;

public class Prob11Vol8 {
	
	public static void main(String[] args) {
		
		int found = 0;
		boolean var = false;
		Scanner src = new Scanner(System.in);
		
		System.out.print("Enter the size : ");
		int size = src.nextInt();
		
		int[] series = new int[size]; // initializing the array
		
		System.out.println("Enter the elements of array :");
		for(int i=0; i<series.length; i++) {
			series[i] = src.nextInt();
		}
		
		System.out.println("Enter the Key : ");
		int key = src.nextInt();
		
		for(int i=0; i<series.length; i++) {
			System.out.println("series["+i+"]= "+series[i]);
			if (key == series[i]) {
				found = i;
				var = true;
			}
		}
		if (var == true) {
			System.out.println("Found at = "+(found+1));
		}
		else {
			System.out.println("Not Found");
		}	
	}
}
