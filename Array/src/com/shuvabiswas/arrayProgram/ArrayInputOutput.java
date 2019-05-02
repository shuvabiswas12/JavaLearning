package com.shuvabiswas.arrayProgram;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayInputOutput {
	static int i, key, count= 0;
	static int num[] = new int[5];

	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		
		System.out.print("Enter the number :");
		for (i=0; i<num.length; i++) {
			num[i] = src.nextInt();
		}
		
		System.out.print("The elements are before sorted : ");
		for (i=0; i<num.length; i++) {
			System.out.print(num[i]+" ");
		}
		
		Arrays.sort(num);
		
		System.out.print("\nThe elements are after sorted : ");
		for (i=0; i<num.length; i++) {
			System.out.print(num[i]+" ");
		}
		
		System.out.println("\ndecending order: ");
		for (i=num.length-1; i>=0; i--) {
			System.out.print(num[i]+" ");
		}
	}
}
