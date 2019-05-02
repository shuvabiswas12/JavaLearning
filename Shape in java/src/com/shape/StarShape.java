package com.shape;

import java.util.Scanner;

public class StarShape {
	
	public static void main(String[] args) {
		Scanner src = new Scanner(System.in);
		int i, j, size;
		System.out.println("Enter the size : ");
		size = src.nextInt();
		for(i=0; i<=size; i++) {
			for(j=1; j<=i; j++) {
				System.out.print(j +" ");
			}
			System.out.println(" ");
		}
		
	}
}
