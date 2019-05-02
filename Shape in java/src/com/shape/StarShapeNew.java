package com.shape;

import java.util.Scanner;

public class StarShapeNew {
	public static void main(String[] args) {
		int i, j, size;
		Scanner src = new Scanner(System.in);
		System.out.println("Enter the size : ");
		size = src.nextInt();
		
		for(i=0; i<size; i++) {
			for(j=0; j<=i; j++) {
				System.out.print("* ");
			}
			System.out.println(" ");
		}
	}

}
